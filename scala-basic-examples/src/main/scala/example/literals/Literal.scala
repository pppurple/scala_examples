package example.literals

object Literal extends App {
  // number
  val intVal: Int = 100
  val longVal: Long = 20L
  val doubleVal: Double = 10.0d
  println(intVal + ", " + longVal + ", " + doubleVal)

  // string
  val str = "str!"
  val strLines = """
      |aaa
      |bbb
    """.stripMargin
  println(str)
  println(strLines)

  // array
  val array = Array("A", "BB", "CCC")
  array.foreach(println)

  // list
  val list = List(1, 22, 333)
  list.foreach(println)

  // map
  val map = Map(1 -> "A", 22 -> "BB", 333 -> "CCC")
  map.foreach{
    case (k, v) => println(k + ":" + v)
  }
}
