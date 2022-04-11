# Overview

Similar to the work you did for Kafka, this is your crash course into Spark through different questions. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like
* Spark By Examples is a great resources to start with - [Spark By Examples](https://sparkbyexamples.com/)

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What problem does Spark help solve? Use a specific use case in your answer 
* Helpful resource: [Apache Spark Use Cases](https://www.toptal.com/spark/introduction-to-apache-spark)
* [Overivew of Apache Spark](https://www.youtube.com/watch?v=znBa13Earms&t=42s)
Response: It's much faster for processing large amounts of data which are needed for interactive applications, real time analytics, and other demanding data needs.
Use Case: I could imagine this being used for something like proactively addressing problems during large live events by analysing web chatter about it. 

#### What is Apache Spark?
* Helpful resource: [Spark Overview](https://www.youtube.com/watch?v=ymtq8yjmD9I)
Response: A distributed processing system for data heavy workloads like those used for machine learning, real time analytics, and interactive queries.

#### What is distributed data processing? How does it relate to Apache Spark?  
[Apache Spark for Beginners](https://medium.com/@aristo_alex/apache-spark-for-beginners-d3b3791e259e)
Response: A method of processing data where a cluster of machines work together for faster, scalable, fault tolerant systems.
Response: Apache Spark is a distributed data processing system.

#### On the physical side of a spark cluster, you have a driver and executors. Define each and give an example of how they work together to process data
Drivers: The Spark Driver is the central coordinator that communicates with all the Workers. They hold all the information about the Executors. They convert code into tasks and then coordinates the execution of said tasks with Executors.
Executors: The Executor is responsible for running a task and register themselves with the Driver. 

#### Define each and explain how they are different from each other 
* RDD (Resilient Distributed Dataset): Immutable distributed collections of objects/data that are fault tolerant. Requires the user to specify the schema of the data.
* DataFrame: Most common data structure using 2 dimensional table. Heavily used because they're flexible and intuitive. Infers the schema of data, but only works with structured and semi-structured data.
* DataSet: A collection of data containing one or more records. These are extensions of dataframes in Spark.

#### What is a spark transformation?
[Spark By Examples-Transformations](https://sparkbyexamples.com/apache-spark-rdd/spark-rdd-transformations/)
Response: Transformations are operations performed on an RDD that change something. Since RDDs are immutable, a transformation always yields a new RDD that has been transformed.

#### What is a spark action? How do actions differ from transformations?
Response: Actions are operations performed on an RDD that return a value. So, more of the mathematical operations.

#### What is a partition in spark? Why would you ever need to repartition? 
[Spark Partitioning](https://sparkbyexamples.com/spark/spark-repartition-vs-coalesce/)
Response: A partition is a logical division of data in a cluster so that it can process efficiently. Repartitioning is very expensive to perform but can increase or decrease the number of partitions on an RDD/Dataframe. It's used to control parallelism

#### What was the most fascinating aspect of Spark to you while learning? 
Response: That it's open source and being used and supported by some of the biggest data centric companies in the world.  
