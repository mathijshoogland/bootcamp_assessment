# Submission Mathijs Hoogland

## Run app
1. Upload all `.csv` files belonging to the project on `hdfs://tmp` 


2. Copy jar file to server 
``scp -P 2222 ~/dir-to-generated-jar-file/bootcamp-assessment_2.11-1.0.jar root@sandbox-hdp.hortonworks.com:/root``

3. Execute file
``spark-submit --class BootcampAssessment --master local ./bootcamp-assessment_2.11-1.0.jar`` 

## Scala + Spark

### Basic HDFS & Hive

Build a Scala application using Spark (you must use [sbt](https://www.scala-sbt.org/) as a build tool) and execute against the Sandbox Hive & Spark to do the following:
- upload the `.csv` files on <a href="data-spark/">`data-spark`</a> to HDFS
- create tables on Hive for each `.csv` file
- output a dataframe on Spark that contains `DRIVERID, NAME, HOURS_LOGGED, MILES_LOGGED` so you can have aggregated information about the driver.

Besides the code on a repo, explain you steps and impression in <a href="`MyExperience.md">`MyExperience.md`</a>.

### HBase

Extend the Scala application above so that it can: 
- create a table `dangerous_driving` on HBase
- load <a href="data-hbase/dangerous-driver.csv">`dangerous-driver.csv`</a>
- add a 4th element to the table from `extra-driver.csv`
- Update `id = 4` to display `routeName` as `Los Angeles to Santa Clara` instead of `Santa Clara to San Diego`
- Outputs to console the Name of the driver, the type of event and the event Time if the origin or destination is `Los Angeles`.

Same thing here, besides the code on a repo, explain you steps and impression in <a href="`MyExperience.md">`MyExperience.md`</a>.

## Extra

- Deliver a containerized Scala app
- Write at least 2 Unit Tests before building the Scala app
