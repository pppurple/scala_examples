package practice.functional

object RecursiveCall extends App {
  def reverse[A](list: List[A], result: List[A]): List[A] = list match {
    case x::xs => reverse(xs, x::result)
    case Nil => result
  }

  reverse(Range(1, 10).toList, Nil).foreach(i => print(s"$i "))
}
