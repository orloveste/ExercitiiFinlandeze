package week_3;

public class Week3_learn {
    public static void main(String[] args) {
        System.out.println(average(2,3,4));
    }
    public static double average(int number1, int number2, int number3){
        int sum = number1+number2+number3;
        double average = sum/3.0;
        return average;
    }
}
//   14.3 The method's own variables
//The following method calculates the average of the numbers the method gets as
// parameters. The method uses helper variables sum and average. The method's own
// variables can be introduced just like any other variables.
//public static double average(int number1, int number2, int number3) {
//
//    int sum = number1 + number2 + number3;
//    double average = sum / 3.0;
//
//    return average;
//}