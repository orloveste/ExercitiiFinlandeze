package week_2;

import java.util.Random;
import java.util.Scanner;

public class Ex41_1_Guessing_a_number {
    public static void main(String[] args) {
        int randomNumber = drawNumber();
//        System.out.println(randomNumber);
        Scanner reader = new Scanner(System.in);
//        int maxNum = 100;
//        int minNum = 0;
//        Random drawNumber;
        while (true){
//            System.out.println(randomNumber);
            System.out.println("Guess a number: ");
            int guessNumber = Integer.parseInt(reader.nextLine());
//            if ((guessNumber < minNum)&&(guessNumber > maxNum)){
//                System.out.println("Number is out of range! ");
//        }
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
//Exercise 41.1: Guessing a number
//The program that comes with the exercise contains a command called drawNumber. It draws a number, which is
// in the range 0 to 100 (both 0 and 100 are possible). Create a program that draws a number. Then the user
// has the chance to guess once, what the number is. The program should to print "The number is lesser", "The
// number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed.
//Guess a number: 12
//The number is greater
//
//Guess a number: 66
//The number is lesser
//
//Guess a number: 42
//Congratulations, your guess is correct!