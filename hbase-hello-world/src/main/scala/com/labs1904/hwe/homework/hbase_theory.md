# Overview

By now you've seen some different Big Data frameworks such as Kafka and Spark. Now we'll be focusing in on HBase. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What is a NoSQL database?
Response: A database that stores data in a format other than relational tables.

#### In your own words, what is Apache HBase? 
Response: A Hadoop non-relational, distributed database for big data. It's a column database good for real time processing and random read/write access to large amount of data.

#### What are some strengths and limitations of HBase? 
* [HBase By Examples](https://sparkbyexamples.com/apache-hbase-tutorial/)
Strengths:
  * Easy to scale
  * Fault tolerant
  * Uses rest API to access table
  * Supports parallel processing
  * Can add/remove columns dynamically 
Weaknesses: 
  * Cannot join different tables
  * Insensitive to CPU and Memory
  * It's a single point of failure
  * Does not support compound keys
  * Can only sort on row keys 

#### Explain the following concepts: 
* Rowkey - A unique identifier for the table row
* Column Qualifier - The columns/names aka column keys
* Column Family - The logical and physical grouping of columns

#### What are the differences between Get and Put commands in HBase? 
* [HBase commands](https://www.tutorialspoint.com/hbase/hbase_create_data.htm)
Response: Put command inserts rows/store data in a table and get command reads data or metadata from the table
  
#### What is the HBase Scan command for? 
* [HBase Scan](https://www.tutorialspoint.com/hbase/hbase_scan.htm)
Response: Get returns a single row whereas scan returns a set of rows

#### What was the most interesting aspect of HBase when went through all the questions? 
Response: Schema-less 