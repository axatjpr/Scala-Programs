package com

object daset {
  def main(args: Array[String]): Unit = {
    val peopleDF = Seq(
      ("andrea", "medellin"),
      ("rodolfo", "medellin"),
      ("abdul", "bangalore")
    )

      .toDF("first_name", "city")

    peopleDF.show()
  }

}
