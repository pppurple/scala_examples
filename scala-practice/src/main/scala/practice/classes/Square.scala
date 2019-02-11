package practice.classes

object SquareMain extends App {
  val s1: Square = new Square(10, 20)
  val s2: Square = new Square(100, 200)
  println(s2.diff(s1))
  println((s1 + s2).size())
}

class Square(val x: Int, val y: Int) {
  def size(): Int = x * y
  def diff(that: Square): Int = {
    val thatSize = that.x * that.y
    x * y - thatSize
  }

  def +(that: Square): Square = {
    new Square(x * y, that.x * that.y)
  }
}
