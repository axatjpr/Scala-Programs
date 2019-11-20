package dfbasics.dfbasics

import org.apache.avro.generic.GenericData.StringType
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types.{StructField, StructType}

object DFwithSS {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("creating DF using spark session")
      .master("local")
      .getOrCreate()
    val rdd = spark.sparkContext.parallelize(Array("1","2","3","4","5"))
    val schema = StructType(
      StructField("Interger as String",StringType,true) :: Nil
    )

    val rowRDD = rdd.map(element => Row(element))

    val df = spark.createDataFrame(rowRDD,schema)

    df.printSchema()
    df.show()

    df.show(3)


  }

}
