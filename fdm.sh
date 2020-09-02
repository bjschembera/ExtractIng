#!/bin/bash

# Wrapper tool for Metadata extraction ExtractIng
# 
# Bjoern Schembera / HLRS / schembera@hlrs.de
# 
#
# 2018-08-03 Initial working version
# 2019-01-30 Removed most shell processing. This is now simply a wrapper tool
# 2019-02-06 Removed more shell stuff. Make the paths absolute here to work 
#	     fine with java 
# 2019-02-27 Added relative path to jar file; configurable via variables
# 2019-05-07 Added post-processing for dcterms output
# 2020-03-17 Renamed the tool to "ExtractIng" (was: "Harvester")
# 2020-08-28 Added some functionality: We now use a different way to specify parameter. Moreover, a list of paths can be passt as the "p" parameter



if [[ $# -eq 0 ]] ; then
      echo Parameters should be specified according to following syntax
      echo ./fdm.sh -c \<configFile\> -p \"\<path1\> \<path2\> ...\" -m \<scanner\|spark\> -e \<executorCores\>
      echo -c refers to the config file, -p refer to the paths, -m refer to the method and -e comes just in case of method \"spark\" and will refer to the number of cores for executing
	exit 0
fi

while getopts ":c:p:m:e:" opt; do
  case $opt in
    c)
      cnf=$OPTARG
      ;;
    p)
      paths=$OPTARG
      ;;
    m)
      mtd=$OPTARG
      ;;
    e)
      exeCore=$OPTARG
      ;;	  
    \?)
      echo "Invalid option: -$OPTARG" >&2
      exit 1
      ;;
    :)
      echo "Invalid option: -$OPTARG" >&2
      exit 1
      ;;
  esac
done


if [ -z "${cnf}" ] || [ -z "${paths}" ] || [ -z "${mtd}" ]; then
      echo Parameters should be specified according to following syntax
      echo ./fdm.sh -c \<configFile\> -p \"\<path1\> \<path2\> ...\" -m \<scanner\|spark\> -e \<executorCores\>
      echo -c refers to the config file, -p refer to the paths, -m refer to the method and -e comes just in case of method \"spark\" and will refer to the number of cores for executing
      exit 0
fi

#We need readlink here to get the absolute path for java if a relative is specified 

#First parameter is the pathname of the config file 
conf=`readlink -f $cnf`

#Third parameter is the harvesting method
method=$mtd

executorCores=$exeCore

#Set location information of the jar file
executionPath=`pwd`

jarPath="/target/ExtractIng-0.82.jar"

jar=$executionPath/$jarPath

path_list=()
for pth in $paths;
do
	
  #Second parameter is the directory to parse
  path=`readlink -f $pth`
  path_list+=("$path")



  if [ ! -d "$path" ]; then
  echo "Directory doesn't exist or no directory... exiting"
  exit 1  
  fi
done

#Wrapping comes here
echo ==============================================================
echo = Processing Metadata from job, log, ... files in directory 
echo = "${path_list[@]}"
echo = with $method
echo ============================================================== 

#If spark is manually installed, uncomment the lines below
#
#~/spark-2.4.5-bin-hadoop2.7/sbin/start-master.sh
#~/spark-2.4.5-bin-hadoop2.7/sbin/start-slave.sh spark://$hostname:7077
if [ "$method" == "spark" ];  then
  spark-submit --class "ExtractIng.ExtractIng" --executor-memory 120g --total-executor-cores $executorCores   $jar $conf ${path_list[@]}  $method
else
  java -cp $jar ExtractIng.ExtractIng $conf ${path_list[@]} $method
fi

# Little post-processing for the atom.xml
if [ -f "$path/.metadata/atom.xml" ]; then
  sed -i 's/<entry xmlns:dcterms="http:\/\/purl.org\/dc\/terms\/" xmlns="http:\/\/www.w3.org\/2005\/Atom" xmlns:ns3="http:\/\/purl.org\/dc\/elements\/1.1\/">/<entry xmlns="http:\/\/www.w3.org\/2005\/Atom" xmlns:dcterms="http:\/\/purl.org\/dc\/terms\/">/' $path/.metadata/atom.xml
fi


echo ...Processing is done 

