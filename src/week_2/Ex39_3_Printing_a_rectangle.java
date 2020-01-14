package week_2;

public class Ex39_3_Printing_a_rectangle {
    public static void main(String[] args) {
        printRectangle(17,3);
    }

    private static void printRectangle(int width, int height) {
        int counter = 0;
        while (counter < height){
            printStars(width);
            System.out.println();
            counter++;
        }
    }
    private static void printStars(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }
}
//Exercise 39.3: Printing a rectangle
//Create a method printRectangle(int width, int height) that prints a rectangle using the printStars
// method. The call printRectangle(17,3), for example, has the following output:
//*****************
//*****************
//*****************