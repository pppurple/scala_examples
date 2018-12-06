package example.objects

object Tuple extends App {
  def getPerson = {
    ("Ann", 21)
  }

  val person = getPerson

  println("name:" + person._1)
  println("age:" + person._2)
}
