object HigherOrderFunction extends App {
  def processInteger(action: Int => Int): String = action(10).toString
  println(processInteger(FunctionPractice.addOne))
}
