package example.function

object Functions extends App {
  // def
  def plus(a: Integer, b: Integer): Integer = {a + b}
  println(plus(10, 20))

  // val
  val plus2: (Integer, Integer) => Integer = (a: Integer, b: Integer) => {a + b}: Integer
  println(plus2(10, 20))

  // lambda
  println((a: Integer, b: Integer) => {a + b})
}
