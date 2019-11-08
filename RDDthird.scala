//how to create a spark session and how to create an RDD from saprk context
package spark

import org.apache.spark.sql.SparkSession

object RDDthird {
  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession.builder().appName("Spark context with spark session")
      .master("local")
      .getOrCreate()

    val array = Array(1,2,3,4,5,6)
    val arrayRDD = sparkSession.sparkContext.parallelize(array,3)

    arrayRDD.foreach(println)

  }

}
