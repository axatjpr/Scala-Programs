package spark

import org.apache.spark.{SparkConf, SparkContext}

object secondspark {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf()
    sparkConf.setAppName("second spark app")
    sparkConf.setMaster("local")

    val sc = new SparkContext(sparkConf)

    val  array = Array (1,2,3,4,5,6,7,8,9)
    val arrayRDD = sc.parallelize(array,4)

     println("number of elemnts in RDD : ",arrayRDD.count())

    arrayRDD.foreach(println)


  }

}
