package week_3;

public class Ex44_Least {
    public static int least(int number1, int number2){
        if (number1>number2){
            return number2;
        }else {
            return number1;
        }
    }

    public static void main(String[] args) {
        int answer = least(7,6);
        System.out.println("Least: "+answer);
    }
}
//Exercise 44: Least
//Create the method least, which returns the least of the numbers given as parameters.
// If the parameters are equal, you can decide which one is returned.
//public static int least(int number1, int number2) {
//    // write program code here
//    // do not print anything inside the method
//
//    // method needs a return in the end
//}
//
//public static void main(String[] args) {
//    int answer =  least(2, 7);
//    System.out.println("Least: " + answer);
//}
//
//Example output:
//Least: 2