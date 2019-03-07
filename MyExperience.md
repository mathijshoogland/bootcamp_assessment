#My experience and further notes

Put here general information about the steps you took, what you liked, disliked, why did you do X instead of Y and so on.

## HDP Sandbox

* I initially decided to go for the Docker installation of the sandbox since I am familiar with docker and it does not 
require you to install anything on your system.
* I was a bit surprised by the size of all the images combined, more than 20GB.
* After all was running started playing around with the different portals that were available The 
hortonworks tutorials are very extensive and detailed, helped me a lot.
https://hortonworks.com/tutorial/hadoop-tutorial-getting-started-with-hdp/
* I initially did not set the hostname variables, assuming the were only for the user to easilly navigate to the docker
instances. Took some time that all the services were failing because of this (and fixed it).
* I really like how all these different tools have become available with this little amount of errort (docker is awesome!)
* Time to start coding...

## HDFS & Hive on Spark
* Took me **a lot** of time to let my app interact with the HDP Sandbox. Often had to restart instances, sometimes
taking 15 minutes tot get all the services back up and running.
* Frustrating that it is quite easy to execute all operations with the different web interfaces, not that easy to
communicate with my scala app.
* The official spark documentation was the clearest that I could find on this topic.
https://spark.apache.org/docs/2.3.1/sql-programming-guide.html
* I used Zeppelin to play around with dataframes and join them, awesome! Similar functionality as jupyter notebooks.


* I spent literally hours trying to bundle the `.csv` files with the `.jar` application, was not able to get this working.
Problem was: was only able to retrieve files from the `resources` folder through an inputstream.
There were simple applications to convert this inputstream to a dataframe, 
- https://stackoverflow.com/questions/27360977/how-to-read-files-from-resources-folder-in-scala
* Eventually have all functionality working, with as only exception that `.csv` files need to be copied to the server.

## HBase
* When trying to connect my application with HBase I got a lot of problems, following error a good example: 
https://community.hortonworks.com/questions/10537/javalangnoclassdeffounderror-orgapachehadoophbaseh.html
* Because Sandobx instance constantly had to be rebooted, and had more and more struggles to keep up, unfortunately had
to setup new sandbox instance in Azure (200$ free credit). 
* I had quite some trouble finding examples of HBase applications, main source was: https://www.tutorialspoint.com/hbase
* Not able to get a functional connection with HBase, app just hangs..


## Overall
* It took me a lot of time to get as far as I got, at least two days.
* Unfortunately quite some time was also spent on
rebooting the sandbox and getting an Azure deployment working. 
* Expected more documentation for HBase applications in Scala, could not find
a lot.
* Although I did not finish the complete assignment, I am looking forward to the technical interview! Have 
the feeling that I learned a lot last couple of days.


