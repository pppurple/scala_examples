package example.implicits

object Main extends App {
  implicit val world: String = "World!"
  implicit def intArg( arg: Int ): String = "Int" + arg
  def printHello(implicit message: String) = println("Hello, " + message + "!")

  printHello("Java")
  printHello
  printHello(123)
}
