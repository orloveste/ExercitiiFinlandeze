package week_3;

public class Ex43_Sum_of_numbers {
    public static int sum(int number1, int number2, int number3, int number4){
        int sum = number1+number2+number3+number4;
        return sum;
    }

    public static void main(String[] args) {
        int answer = sum(4,3,6,1);
        System.out.println("sum: "+answer);
    }
}
//Exercise 43: Sum of numbers
//Create the method sum that calculates the sum of numbers the method receives as
// parameters.
//Place the method in the following program body:
//public static int sum(int number1, int number2, int number3, int number4) {
//    // write program code here
//    // remember that the method needs a return in the end
//}
//
//public static void main(String[] args) {
//    int answer = sum(4, 3, 6, 1);
//    System.out.println("sum: " + answer);
//}
//
//Example output:
//sum: 14
//
//Note: if an exercise involves a method returning something, it means that the
// return type needs to be defined for the method, and that the method needs to
// return a value of that type using the return command. In this case, the method
// does not print (or use the command System.out.println(..)), the method caller
// handles printing, here, the main program..