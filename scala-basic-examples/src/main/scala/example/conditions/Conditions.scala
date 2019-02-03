package example.conditions

object Conditions extends App {
  def printArg(arg: Any): String = {
    arg match {
      case int: Int => s"type Int"
      case string: String => s"type String"
      case double: Double => s"type Double"
      case array: Array[Int] => s"${array.mkString(",")}"
      case list: List[_] => s"$list"
      case person: Person => s"${person.name},${person.age}"
      case _ => "unexpected"
    }
  }

  case class Person(name: String, age: Int)

  println(printArg(100))
  println(printArg("hello"))
  println(printArg(20.0d))
  println(printArg(Array(1, 2, 100)))
  println(printArg(List(1, 2, 100)))
  println(printArg(List("aa", "bb")))
  println(printArg(Person("tama", 8)))
  println(printArg(Array("DDD", "FFF")))
}
