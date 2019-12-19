package week_1;

import nhlstats.NHLStatistics;

public class Ex13_NHL_statistics_part_1 {
    public static void main(String[] args) {
        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("\nTop 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("\nStatistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("\nStatistics for Philadelphia Flyers *");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("*players based on penalty amounts");
        System.out.println("\nPlayers in Anaheim Ducks (abbreviation: ANA) ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
//Exercise 13: NHL statistics, part 1
// Create a program that does the following tasks into the main program body. The tasks must be done in exactly the same
// order as listed below. Do the tasks in the program body one after another without deleting tasks you have already done.
//Note: When you first run the program, the execution might take a while because the information is downloaded from the
// web. Execution should be quick after the first run.
//The program must do the following:
//Print the top ten players based on goals
//Print the top 25 players based on penalty amounts
//Print the statistics for Sidney Crosby
//Print the statistics for Philadelphia Flyers (abbreviation: PHI). *Note in which order the players are printed in and
// why that might be!*
//Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
//After you have successfully submitted the exercise, you can play with the code as you wish!