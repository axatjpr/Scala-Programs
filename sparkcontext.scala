package dfbasics.dfbasics

import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.sql.types.{IntegerType, StructField, StructType}
import org.apache.spark.{SparkConf, SparkContext}
//**
//* in spark 1.x dataframeis created using spark context
// and sql context is created using spark context
//*/

object sparkcontext {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf()
      .setMaster("local")
      .setAppName("creating df with spark context")

    val sc = new SparkContext(sparkConf)


    val sqlcontext =new SQLContext(sc)

    val rdd  = sc.parallelize(Array(1,2,3,4,5))
    val schema = StructType (
      StructField("INTERGER_IDs", IntegerType, true) :: Nil
      )

    val rowRdd = rdd.map(line =>Row(line))
    val df = sqlcontext.createDataFrame(rowRdd,schema)

    df.printSchema()
    df.show()


    }
  }

