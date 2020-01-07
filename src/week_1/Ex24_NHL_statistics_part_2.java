package week_1;

import nhlstats.NHLStatistics;

import java.util.Scanner;
public class Ex24_NHL_statistics_part_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }
            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.print("Which player: ");
                String player = reader.nextLine();
                NHLStatistics.searchByPlayer(player);
            } else if (command.equals("club")) {
                System.out.print("Which club?: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
            }
        }
    }
}
//Exercise 24: NHL statistics, part 2
//We will continue using the NHL component introduced earlier and create a program that the user can use to query for statistics.
//The program is structured similarly to the Calculator example program above. The program body is as follows:
//public static void main(String[] args) throws Exception {
//    Scanner reader = new Scanner(System.in);
//
//    System.out.println("NHL statistics service");
//    while (true) {
//        System.out.println("");
//        System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
//        String command = reader.nextLine();
//
//        if (command.equals("quit")) {
//            break;
//        }
//
//        if (command.equals("points")) {
//            // print the top ten playes sorted by points
//        } else if (command.equals("goals")) {
//            // print the top ten players sorted by goals
//        } else if (command.equals("assists")) {
//            // print the top ten players sorted by assists
//        } else if (command.equals("penalties")) {
//            // print the top ten players sorted by penalties
//        } else if (command.equals("player")) {
//            // ask the user for the player name and print the statistics for that player
//        } else if (command.equals("club")) {
//            // ask the user for the club abbreviation and print the statistics for the club
//            // note: the statistics should be sorted by points
//            //     (players with the most points are first)
//        }
//    }
//}