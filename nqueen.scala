package com.scala.basics.helloworld

object nqueen extends App {

def queens(n: Int): List[List[(Int,Int)]] = {
  def placeQueens(k: Int) : List[List[(Int,Int)]] =
    if(k == 0 )
      List(List())
  else
      for {
        queens <- placeQueens(k - 1)
        column <- 1 to n
        if isSafe(queen, queens)
      }
      println(queen :: queens)
  placeQueens(n)
      }

  def isSafe(queen:(Int,Int),queens: List[(Int, Int)]) =
    queens forall (q=>inCheck(queen,q))
  def inCheck(q1: (Int, Int), q2: (Int, Int)) =
    q1._1 == q2._1 ||
    q1._2 == q2._2 ||
      (q1._1 - q2._1).abs == (q2._2 - q2._2).abs
}

