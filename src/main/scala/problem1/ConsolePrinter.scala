package problem1

class ConsolePrinter(printFunc: String => Unit) {

  def print(input: String): Unit = printFunc(input)

}

object ConsolePrinter {

  def apply(printFunc: String => Unit = { print(_) }): ConsolePrinter =
    new ConsolePrinter(printFunc)

}
