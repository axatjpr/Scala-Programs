object sum {
  def main(args: Array[String]): Unit = {
    //    def sumInts(a:Int, b:Int) : Int =
    //      if(a>b) 0 else a+sumInts(a+1,b)
    //  }
    //}
    //
    //{
    //  def sum(f: Int => Int, a: Int, b: Int): Int =
    //    if (a > b) 0
    //    else f(a) + sum(f, a + 1, b)
    //
    //  def sumInts(a: Int, b: Int) = sum(, id, a, b)
    //
    //  def sumCubes(a: Int, b: Int) = sum(cube, a, b)
    //
    //  def sumFactorial(a: Int, b: Int) = sum(fact, a, b)
    //
    //  def id(x: Int): Int = x
    //
    //  def cube(x: Int) = x * x * x
    //
    //  def fact(x: Int): Int
    //
    //  if (x == 0)
    //  1 else fact(x - 1)
    //
    //}

    def sum(f: Int => Int, a: Int, b: Int): Int = {
      def loop(a: Int, acc: Int): Int = {
        if (a > b) acc
        else loop(a + 1, f(a) + acc)
      }

      loop(a, 0)
    }

    println(sum(x => x * x, 3, 5))

  }

  def product(f:Int =>Int)(a: Int, b: Int) : Int =
     if(a>b) 1
    else f(a) * product (f) (a+1,b)

  println(product(x=>x*x)(3,4))

}




