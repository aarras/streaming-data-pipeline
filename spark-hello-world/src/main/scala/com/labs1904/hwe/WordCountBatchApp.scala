package com.labs1904.hwe

import org.apache.log4j.Logger
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object WordCountBatchApp {
  lazy val logger: Logger = Logger.getLogger(this.getClass)
  val jobName = "WordCountBatchApp"

  def main(args: Array[String]): Unit = {
    logger.info(s"$jobName starting...")
    try {
      val spark = SparkSession.builder()
        .appName(jobName)
        .config("spark.sql.shuffle.partitions", "3")
        .master("local[*]")
        .getOrCreate()
      import spark.implicits._

      val sentences = spark.read.csv("src/main/resources/sentences.txt").as[String]
      //sentences.printSchema

      // TODO: implement me
      val allWords = sentences.map(s => splitSentenceIntoWords(s)).select(explode($"value"))
      val words = allWords.withColumn("col", lower(col("col"))).withColumn("col",regexp_replace($"col","[^A-z]",""))
      val counts = words.groupBy(col("col")).count()

      counts.sort(col("count").desc)show(50)
      //counts.foreach(wordCount=>println(wordCount))

    } catch {
      case e: Exception => logger.error(s"$jobName error in main", e)
    }
  }

  // TODO: implement this function
  // HINT: you may have done this before in Scala practice...
  def splitSentenceIntoWords(sentence: String): Array[String] = sentence.split(" ")

}
