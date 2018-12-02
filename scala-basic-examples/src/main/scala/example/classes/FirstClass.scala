package example.classes

class FirstClass(val name: String, val age: Int) {
  // default constructor
  println("created. name:" + name + ", age:" + age)

  // auxiliary constructor
  def this(name: String) = this(name, 0)
  def this(age: Int) = this("none", age)
  def this() = this("none", 0)
}

object Main extends App {
  new FirstClass("bob", 20)
  new FirstClass("coc")
  new FirstClass(19)
  new FirstClass()
}
