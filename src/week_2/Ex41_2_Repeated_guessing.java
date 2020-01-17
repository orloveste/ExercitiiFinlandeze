package week_2;

import java.util.Random;
import java.util.Scanner;

public class Ex41_2_Repeated_guessing {
    public static void main(String[] args) {
        int randomNumber = drawNumber();
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Guess a number: ");
            int guessNumber = Integer.parseInt(reader.nextLine());
            if (guessNumber < randomNumber){
                System.out.println("The number is greater");
            } else if (guessNumber > randomNumber){
                System.out.println("The number is lesser");
            }else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }
    private static int drawNumber() {
        return new Random().nextInt(100);
    }
}
//Exercise 41.2: Repeated guessing
//Develop your program by adding the following functionality: the guessing should be made repeatedly until the user types the right number. Note that you need to draw the number by using the drawNumber command before the repetition. Why? What happens if you draw the number inside the repetition?
//In the example below, the command call drawNumber returned the value 83.
//Guess a number: 55
//The number is greater
//Guess a number: 85
//The number is lesser
//Guess a number: 77
//The number is greater
//Guess a number: 81
//The number is greater
//Guess a number: 83
//Congratulations, your guess is correct!