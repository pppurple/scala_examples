package example.functions

object Functions extends App {
  // def
  def plus(a: Int, b: Int): Int= {a + b}
  println(plus(10, 20))

  // val
  val plus2: (Int, Int) => Int= (a: Int, b: Int) => {a + b}: Int
  println(plus2(10, 20))

  // lambda
  println((a: Int, b: Int) => {a + b})

  // partial function
  val double = new PartialFunction[Int, Int] {
    override def apply(i: Int): Int = i * 2

    override def isDefinedAt(i: Int): Boolean = i < 10
  }

  if (double.isDefinedAt(5)) {
    println(double(5))
  }

  // higher order
  def higherOrderCalc(calc: => Int => Int => Int): Int = {
    calc(5)(3)
  }

  val higherOrderPlus = (val1: Int) => (val2: Int) => {
    val1 + val2
  }

  println(higherOrderCalc(higherOrderPlus))

  // args with name
  def plusWithName(val1: Int = 100, val2: Int = 20): Int = {
    val1 + val2
  }
  println(plusWithName(val1 = 10, val2 = 15))
  println(plusWithName(val1 = 40))
  println(plusWithName(val2 = 200))
}
