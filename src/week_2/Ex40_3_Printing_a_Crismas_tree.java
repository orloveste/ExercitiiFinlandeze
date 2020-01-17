package week_2;

public class Ex40_3_Printing_a_Crismas_tree {
    public static void main(String[] args) {
        printXmasTree(20);
    }
    public static void printXmasTree(int height) {
        int counter = 0;
        while (counter <= height){
            printWhiteSpaces(height-counter);
            printStars(counter);
            printStars(counter-1);
            System.out.println();
            counter++;
        }
        printRectangle(3,2, height-2);
    }
    private static void printRectangle(int width, int height, int spaceInFront) {
        int counter = 0;
        while (counter < height){
            printWhiteSpaces(spaceInFront);
            printStars(width);
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
//Exercise 40.3: Printing a Christmas tree
//Create the method xmasTree(int height) that prints a Christmas tree using the mehtods printWhitespaces and printStars. A Christmas tree consists of a triangle of given height and a stand. The stand is two stars tall and three stars wide and it is located in the center of the bottom of the triangle. Note: do not print anything in the method itself, just call the helper methods to do the actual printing.
//The method call xmasTree(4), for example, has the following output:
//   *
//  ***
// *****
//*******
//  ***
//  ***
//
//The method call xmasTree(10) has the following output:
//         *
//        ***
//       *****
//      *******
//     *********
//    ***********
//   *************
//  ***************
// *****************
//*******************
//        ***
//        ***
//
//Second note: You don't need to worry about heights below 3!