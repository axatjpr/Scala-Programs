package com

import org.apache.spark.sql.SparkSession

object manbase {

  def main(args: Array[String]): Unit = {
     case class Ratings(userID:Integer, movieID: Integer, rating: Double,timestap:Integer)

    object datasetsbasics {
      def main(args: Array[String]): Unit = {

        val sparkSession = SparkSession.builder()
          .appName(("Dataset basics"))
          .master("local")
          .getOrCreate()
        val ratingDS= sparkSession.read
          .option("header","true")
          .option("inferSchema","true")
          .csv("")
          .as[Ratings]

        val filterDemo = ratingDS.filter(ratingObj => ratingObj.rating == 4)

        filterDemo.show()
        println("count of movie with 4.0 rating" + filterDemo.count())

        ratingDS.show()

        def coalesce(): Unit =
        {
          val data =1 to 15
          val numofPartitions = 5
          val rdd = spark.sparkContext.parallelize(data, numofPartitions)
          rdd.getNumPartitions

        }




      }

    }

  }

}
