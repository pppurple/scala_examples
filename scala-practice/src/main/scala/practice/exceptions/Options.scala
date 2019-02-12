package practice.exceptions

import java.io.File

object Options extends App {
  val directory = new File("./nothing")
  def myListFiles(directory: File): Option[Array[File]] = Option(directory.listFiles())

  val optFiles: Option[Array[File]] = myListFiles(directory)

  println(optFiles.isDefined)

  // myOption
  val optString = Option("value!!")
  optString.foreach(println)
  val optStringNull = Option(null)
  optStringNull.foreach(println) // do nothing

  optString.map(_ + " mapped!!")
    .foreach(println)

  val value = optString.getOrElse("default")
  println(value)
  val gotValue = optStringNull.getOrElse("default")
  println(gotValue)
}
