package com.labs1904.hwe.homework

import java.time.Duration
import java.util.{Arrays, Properties, UUID}

import net.liftweb.json.DefaultFormats
import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord, ConsumerRecords, KafkaConsumer}
import org.apache.kafka.common.serialization.StringDeserializer

object KafkaHomework {
  /**
   * Your task is to try to understand this code and run the consumer successfully. Follow each step below for completion.
   * Implement all the todos below
   */

    //TODO: If these are given in class, change them so that you can run a test. If not, don't worry about this step
  val BootstrapServer = "change-me"
  val Topic: String = "change-me"

  implicit val formats: DefaultFormats.type = DefaultFormats

  def main(args: Array[String]): Unit = {

    // Create the KafkaConsumer
    //TODO: Write in a comment what these lines are doing. What are the properties necessary to instantiate a consumer?
    // Response: Answers behind each line
    val properties = getProperties(BootstrapServer) // Getting server information to establish a connection with Kafka
    val consumer: KafkaConsumer[String, String] = new KafkaConsumer[String, String](properties) // Creating a consumer object with 2 pairs of values: 1)Key/Value and 2)Partition/Offset


    //TODO: What does this line mean? Write your answer in a comment below
    // Response: Subscribing the consumer to multiple topics that are held in an array
    consumer.subscribe(Arrays.asList(Topic))

    while (true) {
      // TODO: Change this to be every 5 seconds
      val duration: Duration = Duration.ofMillis(5000)

      //TODO: Look up the ConsumerRecords class below, in your own words what is the class designed to do?
      // Response: ConsumerRecords is designed to retain the individual ConsumerRecord lists for each partition. Those ConsumerRecord lists hold the details of what data is being received, so the ConsumerRecord class is ultimately getting all the details for the data it needs to pull.
      val records: ConsumerRecords[String, String] = consumer.poll(duration)

      records.forEach((record: ConsumerRecord[String, String]) => {
        // Retrieve the message from each record
        //TODO: Describe why we need the .value() at the end of record
        // Response: To pull the properties from the individual ConsumerRecord lists that were gathered for the ConsumerRecords object above
        val message = record.value()

        //TODO: If you were given the values for the bootstrap servers in class, run the app with the green play button and make sure it runs successfully. You should see message(s) printing out to the screen
        println(s"Message Received: $message")
      })
    }
  }

  def getProperties(bootstrapServer: String): Properties = {
    // Set Properties to be used for Kafka Consumer
    val properties = new Properties
    properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer)
    properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, classOf[StringDeserializer].getName)
    properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, classOf[StringDeserializer].getName)
    properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, UUID.randomUUID().toString)

    properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
    properties
  }

}
