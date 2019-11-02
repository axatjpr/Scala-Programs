package com.scala.basics.helloworld

object array extends App {

  val greetStrings = new Array[String](3)

  greetStrings(0) = "Hello"
  greetStrings(1) = ","
  greetStrings(2) = "woooooooorld!\n"

  for(i <- 0 to 2)
    print(greetStrings(i))// method 1


  val greetStrings2: Array[String] = new Array[String] (3)
  greetStrings2(0) = "test_NEW"
  greetStrings2(1) = "Stringsss"
  greetStrings2(2) = "weehee\n"
  for (i <- 0 to 2)
    print(greetStrings2(i)) //method 2
  for (i <- 0 to 2)
    println(greetStrings2(i))

  val greetStrings3 = new Array[String](3)


  greetStrings3.update(0, "Hello")
  greetStrings3.update(1, ", ")
  greetStrings3.update(2, "world!\n")

  for(i <- 0.to (2))
    print(greetStrings3.apply(i)) // method3

  val naumNames = Array("zero", "one","two")
  for (i <- 0 to 2)
  println(naumNames(i))
  val numNameas2 = Array ("zero" , "one")
  print(numNameas2)
}
