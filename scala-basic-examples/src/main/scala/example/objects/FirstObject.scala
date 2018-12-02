package example.objects

object FirstObject {
  private val name = "first"

  def show(num: Int) {
    println(name + ":" + num)
  }
}

object Main extends App {
  FirstObject.show(4)
}
