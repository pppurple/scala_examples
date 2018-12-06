package example.functions

object Overload extends App {
  def plus(val1: Int, val2: Int): Int = {
    val1 + val2
  }

  def plus(val1: Int, val2: Int, val3: Int): Int = {
    val1 + val2 + val3
  }

  def plus(val1: Double, val2: Double): Double = {
    val1 + val2
  }

  println(2 + 3)
  println(2 + 3 + 4)
  println(2.0 + 3.0)
}
