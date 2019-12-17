package week_1;

import java.util.Scanner;
public class NHL_statistics_part_1 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);

        NHLStatistics.sortByPoints();     // orders the players by points
        NHLStatistics.sortByGoals();      // orders the players by goals
        NHLStatistics.sortByAssists();    // orders the players by assists
        NHLStatistics.sortByPenalties();  // orders the players by penalty minutes

    }
}
