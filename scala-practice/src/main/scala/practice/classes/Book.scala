package practice.classes

object BookMain extends App {
  val book1: Book = Book("java 1st", 2000)
  println(book1)

  val books = Map("java" ->book1, "scala" -> Book("scala 1st", 4000))
  for(book <- books) println(book)

  book1 match {
    case Book(name, price) => println(s"name:$name, price:$price")
  }
}

case class Book(name: String, price: Int)
