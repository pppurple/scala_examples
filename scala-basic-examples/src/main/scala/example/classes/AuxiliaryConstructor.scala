package example.classes

class Cat(name: String) {
  println("name: " + name)

  def this() {
    this("tama")
  }

  def this(name: String, age: Int) {
    this(name)
    println("age: " + age)
  }
}

object MainAuxiliaryConstructor extends App {
  val cat1 = new Cat()
  val cat2 = new Cat("mike")
  val cat3 = new Cat("pochi", 20)
}
