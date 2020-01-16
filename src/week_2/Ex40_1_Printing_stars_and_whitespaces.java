package week_2;

public class Ex40_1_Printing_stars_and_whitespaces {
    public static void main(String[] args) {
        printTriangle(4);
}
    public static void printTriangle(int size) {
        int counter = 0;
        while (counter <= size){
            printStars(counter);
            System.out.println();
            counter++;
        }
    }
    public static void printStars(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }
    public static void printWhiteSpaces(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }
}
//Exercise 40: Printing Like A Boss
//Exercise 40.1: Printing stars and whitespaces
//Create a method printWhitespaces(int size) that prints the given amount of whitespaces. Them method
// should not print a line break.
//Reimplement or copy the method printStars(int size) from the previous exercise.
//Exercise 40.2: Printing a right-aligned triangle
//Create the method printTriangle(int size) that prints a triangle using the mehtods printWhitespaces
// and printStars. Note: do not print anything in the method itself, just call the helper methods to
// do the actual printing.
//For example, the method call printTriangle(4) has the following output:
//   *
//  **
// ***
//****