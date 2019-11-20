package com

import org.apache.spark.sql.SparkSession

object operations {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
    .master("local")
      .appName("basicsdatafeaem")
      .getOrCreate()

    val customerDF = spark.read("")

    //customerDF.printSchema()
    val customerSchema = customerDF.schema
    println(customerSchema)

    val colNames = customerDF.columns
    println("column names")
    println((colNames.mkstring(",")))
    val customerDescriptin = customerDF.describe()

    customerDescriptin.show()


  }

}
