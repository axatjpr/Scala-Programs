package com

import org.apache.spark.sql.SparkSession

object multiplesparksss {

  def main(args: Array[String]): Unit = {

    val sparkSession1 = SparkSession.builder()
      .master("local")
      .appName("Creating Multiple spark session")
      .getOrCreate()

    val sparksession2 =SparkSession.builder()
      .master("local")
      .appName("multipel ssss1")
      .getOrCreate()

    val rdd1 = sparkSession1.sparkContext.parallelize(Array(1,2,3,4,5,6),3)
    val rdd2 = sparksession2.sparkContext.parallelize(Array(1,2,3,4,5),5)

    rdd1.collect().foreach(println)
    rdd2.collect().foreach(println)

  }
}
