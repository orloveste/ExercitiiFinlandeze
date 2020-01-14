package week_2;

public class Ex39_1_Printing {
    private static void printStars(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args){
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
//Exercise 39: Printing
//Exercise 39.1: Printing stars
//Create a method printStars that prints the given amount of stars and a line break.
//Create the method in the following body:
//private static void printStars(int amount) {
//    // you can print one star with the command
//    // System.out.print("*");
//    // call this command amount times
//}
//
//public static void main(String[] args) {
//    printStars(5);
//    printStars(3);
//    printStars(9);
//}
//
//The program output:
//*****
//***
//*********
//
//Note: you can return exercises that contain many parts to the exercise robot even though you
// are not finished with all parts. In that case, the robot complains about tests in the unfinished
// parts of the exercise, but gives you points for all tests that pass.