package week_1;

import nhlstats.NHLStatistics;

import java.util.Scanner;
public class Ex13_NHL_statistics_part_1 {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");

        NHLStatistics.top(10);
    }
}
