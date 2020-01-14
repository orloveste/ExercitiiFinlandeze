package week_2;

public class Ex39_2_Printing_a_square {
    private static void printSquare(int sideSize){
        int counter = 0;
        while (counter < sideSize){
            printStars(sideSize);
            System.out.println();
            counter++;
        }
    }
    private static void printStars(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print(" * ");
        }
    }
    public static void main(String[] args) {
        printSquare(4);
    }
}
//Exercise 39.2: Printing a square
//Create a method printSquare(int sideSize) that prints a square using our previous method printStars.
// The method call printSquare(4), for example, prints the following:
//****
//****
//****
//****
//
//Note: in order to complete the exercise it is not enough that the outprint looks good. Inside the
// printSquare method the printing must be done using the printStars method.
//When you are in the middle of making your program, you should verify the correctness of your methods
// by writing some test code into your main method.