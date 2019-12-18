package week_1;

public class Ex5_Seconds_in_a_year {
    //Exercise 5: Seconds in a year
    //Create a program that counts how many seconds there are in a year. You can assume that a year consists of 365
    // days (therefore the year is not a leap year).
    public static void main(String[] args) {
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInHour = 60;
        int resultSecondsInYear = daysInYear*hoursInDay*minutesInHour*secondsInHour;
        System.out.println("There are " + resultSecondsInYear + " seconds in a year.");
    }
}
