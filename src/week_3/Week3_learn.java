package week_3;

import java.util.Scanner;

public class Week3_learn {
    public static void main(String[] args) {
//        int number = alwaysReturnTen();
//        System.out.println( "method returned the number " + number );

//        double number = 4*alwaysReturnTen()+(alwaysReturnTen()/2)-8;
//        System.out.println("calculation total "+number);
//        methodThatReturnsNothing();
//        System.out.println("return nothing ");
//        int number2 = methodThatReturnsInteger();
//        System.out.println("return Integer "+ number2);
//        String text = methodThatReturnsText();
//        System.out.println("return text "+text);
//        double floating = methodThatReturnsFloatingpoint();
//        System.out.println("return floating "+floating);
//        wrongMethod();
//
//        int sumNumbers = sum(2,7);
//        System.out.println(sumNumbers);
        Scanner reader = new Scanner((System.in));
        System.out.println("Type the first number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        System.out.println("Total: "+sum(firstNum,secondNum));
        firstNum = 3;
        secondNum = 2;

        System.out.println(sum(sum(1,2), sum(firstNum,secondNum)));

    }
    public static int sum(int firstNum, int secondNum){
        return firstNum+secondNum;
    }
//    public static String wrongMethod(){
//        System.out.println("I tell you that I will return a String but I do not!");
//        return null;
//    }
//
//    private static double methodThatReturnsFloatingpoint() {
//        return 88;
//    }
//
//    private static String methodThatReturnsText() {
//        return "semething";
//    }
//
//    private static int methodThatReturnsInteger() {
//        return 9;
//    }
//
//    private static void methodThatReturnsNothing() {
//    }
//
//    public static int alwaysReturnTen(){
//        return 10;
//    }
}
//14.2 Return values
//A method can return a value. In the examples above, methods have not been returning
// anything. This is expressed by writing void in the first line of the method, just
// before it's name.
//public static void addThree() {
//  ...
//When defining a method that returns a value, we also have to define the type of
// the return value. We can define the type of the return value by writing it just
// before the name of the method. Next, we have a method that always returns the
// number 10 (type int). Returning a value is accomplished with the command return:
//public static int alwaysReturnTen() {
//    return 10;
//}
//If we want to use the returned value later, we have to catch the return value and
// store it into a variable:
//public static void main(String[] args) {
//    int number = alwaysReturnTen();
//
//    System.out.println( "method returned the number " + number );
//}
//The return value of the method is assigned to a variable of type int just like any
// other integer. The return value can also be a part of a sentence:
//double number = 4 * alwaysReturnTen() + (alwaysReturnTen() / 2) - 8;
//
//System.out.println( "calculation total " + number );
//Every variable type we have seen this far can be used as a return value:
//public static void methodThatReturnsNothing() {
//  // method body
//}
//
//public static int methodThatReturnsInteger() {
//  // method body, needs a return statement
//}
//
//public static String methodThatReturnsText() {
//  // method body, needs a return statement
//}
//
//public static double methodThatReturnsFloatingpoint() {
//  // method body, needs a return statement
//}
//If the method is defined to have a return value, it also has to return a value. The
// following method is incorrect:
//public static String wrongMethod() {
//    System.out.println("I tell you that I will return a String but I do not!");
//}
//In the following example, we define a method for calculating a sum. Then, we use the
// method to calculate 2 + 7. The return value (returned after the method call) is
// assigned to a variable called sumNumbers.
//public static int sum(int first, int second) {
//    return first + second;
//}
//Method call:
//int sumNumbers = sum(2, 7);
//// sumNumbers now holds the value 9
//Let us expand the example program so that the user types the numbers.
//public static void main(String[] args) {
//    Scanner reader = new Scanner(System.in);
//
//    System.out.print("Type the first number: ");
//    int first = Integer.parseInt( reader.nextLine() );
//
//    System.out.print("Type the second number: ");
//    int second = Integer.parseInt( reader.nextLine() );
//
//    System.out.print("Total: " + sum(first,second) );
//}
//
//public static int sum(int first, int second) {
//    return first + second;
//}
//As we can see, the return value of the method does not always need to be assigned
// to a variable. It can also act as a part of the printing command just like any
// other integer value.
//In the next example, we call the method sum using integers that we get as return
// values from the method sum.
//int first = 3;
//int second = 2;
//
//sum(sum(1, 2), sum(first, second));
//// 1) the inner methods are executed:
////    sum(1, 2) = 3   and sum(first, second) = 5
//// 2) the outer method is executed:
////    sum(3, 5) = 8