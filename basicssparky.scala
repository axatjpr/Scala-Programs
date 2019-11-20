package com

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object basicssparky {
  def main(args: Array[String]): Unit = {

    val sparkconf = new SparkConf().setMaster("local").setAppName("basics from CSV from spark 1.x ")

    val sc = new SparkContext(sparkconf)

    val sqlContext = new SQLContext(sc)

    val df = sqlContext.read
       // .option("header","true")
      //.option("inferSchema","true")
      .format("com.databricks.spark.csv")
      .load("resources/datasets/appstore_games.csv")

    df.printSchema()
    df.show()




  }

}
