package practice.traits

trait Printer {
  val size: Int
  def show(): Unit = println(size)
}
