package example.basic

object MainMixinApp extends App {
  def decorate(str: String) = "|" + str + "|"
  print(decorate("hello!!"))
}
