object json extends App {
  //  def main(args: Array[String]): Unit = {}
  //  println("\nStep 2: Using backslash to escpae quotes")
  //  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  //  println(s"donutJson2 = $donutJson2")
  //
  //  val numberofdonuts = 56
  //  val mindonuttoSell: String = numberofdonuts.toString()
  //  println(mindonuttoSell)
  //
  //}
  //
  //def isPrime2(i :Int) : Boolean = {
  //       if (i <= 1)
  //         false
  //      else if (i == 2)
  //         true
  //       else
  //         !(2 to (i-1)).exists(x => i % x == 0)
  //     }
  //
  //
  //  /** Print prime numbers less than 100, very inefficiently */
  //  object primes extends App{
  //    def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  //    for (i <- 1 to 100 if isPrime(i)) println(i)
  //  }
  //


  val range = 1 to 10
  println(range.toList)

  val reverse = "SCALA".reverse
  println(reverse)
  val cap = "scala".capitalize
  println(cap)
  val Multi = "ala" * 7
  println(Multi)
  val ab = "hello".reverse.capitalize * 12

  println(ab)

  var i,sum=0
  while(i<10)
    {
      sum+=i
      i+=1
    }
  println(sum)


}

