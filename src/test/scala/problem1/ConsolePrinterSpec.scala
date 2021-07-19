package problem1

import utils.BaseSpec
import java.util.Deque
import java.util.ArrayDeque

class ConsolePrinterSpec extends BaseSpec {

  val outputStream = new ArrayDeque[String]()
  val console      = ConsolePrinter({ outputStream.push(_) })

  test("Print n numbers to the console") {
    val expected = "1,2,3,4,5,6,7,8,9,10"
    val input    = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    console.print(input.mkString(","))
    val actual = outputStream.pop()

    actual shouldEqual expected
  }

}
