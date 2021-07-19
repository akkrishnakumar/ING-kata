package problem3

import utils.BaseSpec

class FootballSpec extends BaseSpec {

  test(
    "Aston Villa should be the team with the smallest 'for' and 'against' difference in given data file"
  ) {

    val dataFile     = "football.dat"
    val expectedTeam = FootballData("Aston_Villa", 46, 47)

    def smallestDifference(data: FootballData) = Math.abs(data.againstGoals - data.forGoals)

    val actualTeam =
      FindSmallest[FootballData](smallestDifference)(Ripper[FootballData](dataFile))

    actualTeam shouldEqual expectedTeam

  }

}
