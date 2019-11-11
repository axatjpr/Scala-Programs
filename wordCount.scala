package com

import org.apache.spark.{SparkConf, SparkContext}

object wordCount {
  def main(args: Array[String]): Unit = {

    val inputFile = args(0)
    val outputFile = args(1)

    val conf  = new SparkConf().setAppName("wordCount")
  //create   scala saprk context
    val sc = new SparkContext(conf)
//load input data
    val input = sc.textFile(inputFile)
    //split into words
    val words = input.flatMap(line => line .split(" "))
    val counts = words.map(word =>(word,1)).reduceByKey{case (x,y) => x+y}

    counts.saveAsTextFile(outputFile)

  }

}
