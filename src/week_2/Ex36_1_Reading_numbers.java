package week_2;

import java.util.Scanner;

public class Ex36_1_Reading_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while (true) {
            int introducedNUmber = Integer.parseInt(reader.nextLine());
            if (introducedNUmber == -1){
                System.out.println("Thank you and see you later! ");
                break;
            }
        }
    }
}
//Exercise 36: Loops, ending and remembering
//This set of exercises will form one larger program when put together. We create the program by adding features
// exercise by exercise. If you do not finish all the exercises you can still send them to be reviewed by the
// exercise robot. To do that, click the "submit" button, which has a picture of an arrow and is located on the
// right of the testing button. Even though the exercise robot complains about tests in the incomplete exercises,
// you will still get points for the parts you have completed.
//Note: from now on every sub-exercise of a larger exercise (like 36.1) has the same value as an exercise without
// sub-exercises. It means that exercise 36 as a whole corresponds to five normal exercises.
//Exercise 36.1: Reading numbers
//Create a program that asks the user to input numbers (integers). The program prints "Type numbers” until the
// user types the number -1. When the user types the number -1, the program prints "Thank you and see you
// later!" and ends.
//Type numbers:
//5
//2
//4
//-1
//Thank you and see you later!