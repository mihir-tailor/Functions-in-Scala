object AnonymousFunction extends App {
  println(HigherOrderFunction.processInteger(
      FunctionPractice.addOne
    )
  )
  println(
    HigherOrderFunction.processInteger(
      (x: Int) => x + 1
    )
  )

  (1 to 10).map((x: Int) => x + 1).filter(_ % 2 == 1).foreach(println)
  (1 to 10).map(x => x + 1)       .filter(_ % 2 == 1).foreach(println)
  (1 to 10).map(_ + 1)            .filter(_ % 2 == 1).foreach(println)
}
