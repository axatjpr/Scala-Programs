package com

import org.apache.spark.{SparkConf, SparkContext}

object multiplespark {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
      .setMaster("local")
      .setAppName("multiple spark context in a single spark jo")
      .


    val sc  = new SparkContext(sparkConf)

    val sc1 = new SparkContext(sparkConf)

    val rdd = sc.parallelize(Array(1,2,3,4,5,6))

    val rdd1 = sc.parallelize(Array(1,2,3,4,5,6))

    rdd.collect()
    rdd1.collect()
  }

}
