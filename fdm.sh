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


#We need readlink here to get the absolute path for java if a relative is specified 

#First parameter is the pathname of the config file 
conf=`readlink -f $1`

#Second parameter is the directory to parse
path=`readlink -f $2`

#Third parameter is the harvesting method
method=$3

executorCores=$4

#Set location information of the jar file
executionPath=`pwd`

#last working version with old naming convention
#jarPath="/target/Harvester-0.72.jar"

jarPath="/target/ExtractIng-0.8.jar"

jar=$executionPath/$jarPath


if [ ! -d "$path" ]; then
  echo "Directory doesn't exist or no directory... exiting"
  exit 1  
fi

#Wrapping comes here
echo ==============================================================
echo = Processing Metadata from job, log, ... files in directory 
echo = $path
echo = with $method
echo ============================================================== 

#If spark is manually installed, uncomment the lines below
#
#~/spark-2.3.1-bin-hadoop2.7/sbin/start-master.sh
#~/spark-2.3.1-bin-hadoop2.7/sbin/start-slave.sh spark://$hostname:7077
if [ "$method" == "spark" ];  then
	spark-submit --class "ExtractIng.ExtractIng" --executor-memory 120g --total-executor-cores $executorCores   $jar $conf $path  $method
else
	java -cp $jar ExtractIng.ExtractIng $conf $path $method
fi

# Little post-processing for the atom.xml
if [ -f "$path/.metadata/atom.xml" ]; then
	sed -i 's/<entry xmlns:dcterms="http:\/\/purl.org\/dc\/terms\/" xmlns="http:\/\/www.w3.org\/2005\/Atom" xmlns:ns3="http:\/\/purl.org\/dc\/elements\/1.1\/">/<entry xmlns="http:\/\/www.w3.org\/2005\/Atom" xmlns:dcterms="http:\/\/purl.org\/dc\/terms\/">/' $path/.metadata/atom.xml
fi



echo ...Processing is done 

