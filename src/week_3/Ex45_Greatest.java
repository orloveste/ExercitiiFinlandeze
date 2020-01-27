package week_3;

public class Ex45_Greatest {
    private static int greatest(int number1, int number2, int number3){
//        greatest(Math.max(number1,number2,number3));
        if (number1>number2 && number1>number3){
            return number1;
        } else if (number2>number1 && number2>number3){
            return number2;
        }else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int answer = greatest(12,7,9);
        System.out.println("Greatest: "+answer);
    }
}
//Exercise 45: Greatest
//Create the method greatest, which gets three integers as parameters and then returns
// the greatest of them. If there are several parameters that are equally great, you
// can decide which one is returned. Printing should be done in the main program.
//public static int greatest(int number1, int number2, int number3) {
//    // write your code here
//}
//
//public static void main(String[] args) {
//    int answer =  greatest(2, 7, 3);
//    System.out.println("Greatest: " + answer);
//}
//
//Example output:
//Greatest: 7
