package spark

import org.apache.spark.{SparkConf, SparkContext}


object first {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("First Application")

    val sc = new SparkContext(conf)

    //create RDD

    val rdd1 = sc.makeRDD(Array(1,2,3,4,5,6,7,8,9))
    rdd1.collect().foreach(println)

  }

}
