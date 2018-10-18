package example.basic

object Main {
 def decorate(str: String) = "#" + str + "#"

 def main(args: Array[String]): Unit = {
  println(decorate("hello scala!"))
 }
}
