package problem3

import utils.BaseSpec

class FootballSpec extends BaseSpec {

  test(
    "Aston Villa should be the team with the smallest 'for' and 'against' difference in given data file"
  ) {

    val dataFile     = "football.bat"
    val expectedTeam = "Aston_Villa 46 47"

    val actualTeam: String = ""

    actualTeam shouldEqual expectedTeam

  }
}
