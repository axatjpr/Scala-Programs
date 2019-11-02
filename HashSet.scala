
object HhSet {
  def main(args: Array[String]): Unit = {
    import scala.collection.immutable.HashSet
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "coriander")

  }

}
