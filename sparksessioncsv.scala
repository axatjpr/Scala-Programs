package com.com

import org.apache.spark.sql.SparkSession

object sparksessioncsv {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .master("local")
      .appName("creating  df using csv spark 2.0")
      .getOrCreate()

    val properties = Map("header"-> "true","inferSchema" -> "true")
    val df = spark.read
//      .option("header","true")
        .options(properties)
      .csv("resources/datasets/appstore_games.csv")

    df.printSchema()
    df.show()

  }
}
