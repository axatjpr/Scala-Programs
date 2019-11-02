package com.scala.basics.helloworld

object functional {
  def main(args: Array[String]): Unit = {
    def printArgs(args : Array[String]): Unit = {
      var i=0
      while(i<args.length)
        {
          println(args(i))
          i +=1
        }
    }
  }

}
