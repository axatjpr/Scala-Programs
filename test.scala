object test {
def main(args: Array[String]): Unit = {
    println("testing1")
  }
  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")
    case class Donut(name:String, tastelevel:String)
    val favouriteDonut2: Donut = Donut ("Glazed Donut","very tasty")
  println(s"My fav donut name  = ${favouriteDonut2.name}, tastelevel = ${favouriteDonut2.tastelevel}")
  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")



}