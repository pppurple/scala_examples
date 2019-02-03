package example.loops

object Loops extends App {
  def printFor(numLoop: Int): Int = {
    var (i, sum) = (1, 0)
    for(i <-  1 to numLoop) {
      sum += i
      println(sum)
    }
    sum
  }

  printFor(10)

  val upperCases = Map(
    "a" -> "A",
    "b" -> "B",
    "c" -> "C"
  )

  for((lower, upper) <- upperCases)
    println("upper:" + upper + ", lower:" + lower)
}
