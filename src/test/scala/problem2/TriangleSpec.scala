package problem2

import utils.BaseSpec

class TriangleFormulaeSpec extends BaseSpec {

  test("Area of triangle with base 10 and height 10 should be 50") {
    val expectedArea: Double = 50.0
    val triangle             = new Triangle(10, 10)

    val actualArea: Double = triangle.area

    actualArea shouldEqual expectedArea
  }
}
