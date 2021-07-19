package problem1

class ConsolePrinter(printFunc: String => Unit) {

  def print(input: String): Unit = printFunc(input)

}
