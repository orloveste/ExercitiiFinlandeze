package week_2;

public class Ex40_2_Printing_a_right_aligned_triangle {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int size) {
        int counter = 0;
        while (counter <= size){
            printWhiteSpaces(size-counter);
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
//Exercise 40.2: Printing a right-aligned triangle
//Create the method printTriangle(int size) that prints a triangle using the mehtods
// printWhitespaces and printStars. Note: do not print anything in the method itself,
// just call the helper methods to do the actual printing.
//For example, the method call printTriangle(4) has the following output:
//   *
//  **
// ***
//****