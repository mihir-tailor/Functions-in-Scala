object HigherOrderFunction2 extends App {
  (1 to 10).map(FunctionPractice.addOne)

  def isOdd(in: Int): Boolean = in % 2 == 1
  (1 to 10).map(FunctionPractice.addOne).filter(isOdd)


  (1 to 10).map(FunctionPractice.addOne).filter(isOdd).foreach(println)

}
