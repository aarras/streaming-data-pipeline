# Overview

Kafka has many moving pieces, but also has a ton of helpful resources to learn available online. In this homework, your
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
#### What problem does Kafka help solve? Use a specific use case in your answer 
* Helpful resource: [Confluent Motivations and Use Cases](https://youtu.be/BsojaA1XnpM)

Response: Reliable real-time analysis to handle the growing need for reactive applications and interactivity between IoT devices. As for an example, I could see this being useful in healthcare to develop less invasive and cheaper options to people that need permanent monitoring done on internal parts (the idea being that data from smart devices can be used more effectively as reliable monitors).

#### What is Kafka?
* Helpful resource: [Kafka in 6 minutes](https://youtu.be/Ch5VhJzaoaI) 

Response: A distributed data streaming platform based on events rather than state. It uses partition logs with subscriptions that many can use at once and can retain the data indefinitely in a secure and resilient way.

#### Describe each of the following with an example of how they all fit together: 
 * Topic: A group of partitions handling the same type of data
 * Producer: Client applications that read updates and write them to the queue
 * Consumer: Downstream processes that consume the updates from the queue
 * Broker: A server that holds one or more partitions (queues)
 * Partition: A data queue

#### Describe Kafka Producers and Consumers

Response: Producers and consumers are applications independent of each other with Kafka and can have from zero to many connections on either side of the queue. An application that consumes records can also be a producer of records to another consumer. APIs for each have been written in different languages so there is no coding required to connect them to a system. 

#### How are consumers and consumer groups different in Kafka? 
* Helpful resource: [Consumers](https://youtu.be/lAdG16KaHLs)
* Helpful resource: [Confluent Consumer Overview](https://youtu.be/Z9g4jMQwog0)

Response: A single consumer has to read from every subscription whereas a consumer group will help by redistributing the work load. Deploying an instance of a consumer in a group that already has enough consumers to cover all subscriptions will be idle as there is nothing for it to handle. Ordering is preserved while scaling out when done with Kafka.

#### How are Kafka offsets different than partitions?

Response: Kafka stores offsets where a consumer group has been reading. It's essentially a bookmark.

#### How is data assigned to a specific partition in Kafka?

Response: If there is no key it is distributed across all partitions. Otherwise, the key is used to identify that partition so that certain data can be kept together.

#### Describe immutability - Is data on a Kafka topic immutable?

Response: Data is stored in sequence on a partition that can only be appended to, meaning that is unable to be changed from the producer's point of view.

#### How is data replicated across brokers in kafka? If you have a replication factor of 3 and 3 brokers, explain how data is spread across brokers
* Helpful resource [Brokers and Replication factors](https://youtu.be/ZOU7PJWZU9w)

Response: Depending on the replication factor, a partition will be replicated until it exists on that many brokers. There is only 1 leader per a partition that can read/write that data. If there were 3 brokers and a replication factor of 3 then all 3 brokers would hold all the partitions.

#### What was the most fascinating aspect of Kafka to you while learning? 

Response: I can't remember where I saw it, but one source said the producer/consumer APIs required little work and can integrate with all the antiquated systems. I find that particularly important for ease of adoption to greater technologies.