package practice.loops

object Loops extends App {
  val filtered = Range(1, 10).filter(i => i % 2 == 0)
  for (i <- filtered) println(s"filtered:$i")
  val filtered2 = Range(1, 10).filter(_ % 2 == 0)
  for (i <- filtered2) println(s"filtered2:$i")

  val doubled = Range(1, 5).map(i => i * 2)
  for(i <- doubled) println(s"doubled:$i")
  val doubled2 = Range(1, 5).map(_ * 2)
  for(i <- doubled2) println(s"doubled2:$i")

  val flatMapped: Seq[Int] = Seq(Seq(1, 2, 3), Seq(10, 11, 12)).flatMap{s => s}
  for(i <- flatMapped) println(s"flat:$i")

  val nestedFlatMapped = (1 to 3).flatMap{i => (2 to 4)
    .flatMap{j => (3 to 5).map{k => i * j * k}.filter(_ % 3 == 0)
    }
  }
  for(i <- nestedFlatMapped) println(s"nested:$i")

  val usingFor: Seq[Int] = for{
    i <- (1 to 3)
    j <- (2 to 4)
    k <- (3 to 5)
    result = (i * j * k) if result % 3 == 0
  } yield result
  for(i <- usingFor) println(s"usingFor:$i")
}
