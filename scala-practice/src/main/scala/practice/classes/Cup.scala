package practice.classes

import practice.traits.{Enumerable, Printer}

object CupMain extends App {
  val cup: Cup = new Cup(100)
  cup.show()

  val shelf: Shelf = new Shelf

  println("map")
  for(c <- shelf.map(_.size * 10)) println(c)

  println("filter")
  for(c <- shelf.filter(_.size > 120)) c.show()

  println("toList")
  for(c <- shelf.toList) c.show()
}

class Cup(val size: Int) extends AnyRef with Printer

class Shelf extends AnyRef with Enumerable[Cup] {
  private[this] val cups: List[Cup] = List(new Cup(100), new Cup(200))

  override def foreach[B](f: Cup => B): Unit = cups.foreach(f)
}
