package week_3;

public class Ex46_Average_of_given_numbers {
    private static double average(int number1, int number2, int number3, int number4){
        double sum = number1+number2+number3+number4;
        return sum/4;
    }

    public static void main(String[] args) {
        double answer = average(1,2,5,1);
        System.out.println("average: "+answer);
    }
}
//Exercise 46: Average of given numbers
//Create the method average, which calculates the average of the numbers it gets as
// parameters. Inside the method you should use the method sum as a helper!
//Place the method in the following program body:
//public static double average(int number1, int number2, int number3, int number4) {
//    // write your code here
//}
//
//public static void main(String[] args) {
//    double answer = average(4, 3, 6, 1);
//    System.out.println("average: " + answer);
//}
//
//
//Program output:
//average: 3.5
//
//Make sure you remember how you can transform a whole number (int) into a decimal
// number (double)!