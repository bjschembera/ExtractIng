# ExtractIng

ExtractIng is a tool for the automated metadata extraction. It was developed for the extraction of simulation code outputs in high performance computing environments.

Prerequisites
-----


For compiling:
* Maven
* Java 8 (JDK)

For running:
* Java 8 (JRE)
* Bash
* Spark, if the parallel version should be used





Build
-----

To build the harvester:

    mvn clean package

Or:

    mvn clean test-compile install package


Configuration
-----

There are several levels of configuration for the tool.

1. Configuration of the metadata model.

ExtractIng is not bound to a metadata model. The metadata model defines the keys that can be parsed. As it stands, ExtractIng is implemented with EngMeta, a metadata model for computational engineering ([1], [2]). If a different metadata model should be used, the XSD can be automatically transformed to Java classes with the help of the JAXB framework, which was used here. Ususally the user won't do this. If it must be done, all the output classes have to be written for these specific Java classes.

2. Configuration of the simulation code.

ExtractIng is not bound to a specific simulation code. It is designed in generic way so that users specifiy what and where to parse in a configuration file. A sample file `fdm.conf` is delivered with the package. The configuration file is basically a lookup table with the following syntax:

   \<EngMetaKey\>,\<filename>,\<searchKey>,\<delimiter>,\<semantics>

where

\<EngMetaKey> is the metadata key according to the EngMeta scheme, that should be extracted.

\<filename> is the name of the file (and path) where the information can be found.

\<searchKey> the search key, where the metadata information is found.

\<delimiter> specifies the delimiter that sperates the key from the value.

\<semantics> is needed when there are multiple occurences of the same key.


The user has to specifiy each information he or she wants to extract for each simulation code once.

Basically the tool can extract metadata information that complies to the form

   \<key><\delimiter><\value>

3. Configration of the wrapping script.

The user might needs to adjust some paths in the `fdm.sh` wrapper script. Especially the `jarPath` has to be set carefully to the actual directory of the jar file of ExtractIng.

Usage
-----

ExtractIng is wrapped in script, which performs some preparatory tasks before runnig the extraction. The syntax of the script is as follows:

    ./fdm.sh <configFile> <directoryToParse> [scanner|spark]

`<configFile>` should hold the location of the configuration file

`<directoryToParse>` specifies the directory of the simulation code outputs, where the information should be extracted from

`[scanner|spark]` specifies the mode: scanner mode is the native, parallel mode, whereas spark is the parallel execution mode that needs the Spark Data Analytics Framework

Development Roadmap
-----

Since this is a prototypical implementation, we try to continiously improve the code and add feature.

Planned for 2Q2020:
* Syntax improvements for the wrapper script.
* Multiple directories can be passed in the parameters for the directory.
* Improved cutting function to capture values that are marshalled with leading and trailing characters, such as `key="value"`.
* Multiple data files in one directory should be handled.



References
-----

[1] Schembera, Björn, and Dorothea Iglezakis. "The Genesis of EngMeta-A Metadata Model for Research Data in Computational Engineering." Research Conference on Metadata and Semantics Research. Springer, Cham, 2018. https://link.springer.com/chapter/10.1007/978-3-030-14401-2_12

[2] https://www.izus.uni-stuttgart.de/fokus/engmeta/
