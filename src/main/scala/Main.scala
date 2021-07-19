import problem1.ConsolePrinter
object Main extends App {

  println("=" * 100)

  println("Problem 1")

  val input   = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val printer = ConsolePrinter()

  printer.print(input.mkString(","))
  print("\n")

  println("=" * 100)

}
