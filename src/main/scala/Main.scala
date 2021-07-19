import problem1.ConsolePrinter
import problem2.Triangle
import problem3.FindSmallest
import problem3.FootballData
import problem3.Ripper
object Main extends App {

  println("=" * 100)

  println("Problem 1")

  val input   = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val printer = ConsolePrinter()

  printer.print(input.mkString(","))
  print("\n")

  println("=" * 100)

  println("Problem 2")

  val triangle = new Triangle(10, 10)

  println(s"Area of Triangle with base 10 and height 10 is ${triangle.area}")

  println("=" * 100)

  println("Problem 3")

  def smallestDifference(data: FootballData) = Math.abs(data.againstGoals - data.forGoals)

  val team = FindSmallest[FootballData](smallestDifference)(Ripper[FootballData]("football.dat"))

  println(
    s"Team with the smallest difference in 'for' and 'against' goals is ${team.name} with" +
      s" Goals For: ${team.forGoals} and Goals Against: ${team.againstGoals}"
  )

  println("=" * 100)

}
