package week_2;

import java.util.Random;
import java.util.Scanner;

public class Ex41_3_Counting_the_guesses {
    public static void main(String[] args) {
        int randomNumber = drawNumber();
        Scanner reader = new Scanner(System.in);
        int count = 0;

        while (true){
            System.out.print("Guess a number: ");
            count++;
            int guessNumber = Integer.parseInt(reader.nextLine());
            if (guessNumber < randomNumber){
                System.out.println("The number is greater, guesses made: "+count);
            } else if (guessNumber > randomNumber){
                System.out.println("The number is lesser, guesses made: "+count);
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
//Exercise 41.3: Counting the guesses
//Develop your program by adding the following functionality: the program needs to include a variable
// of type int, which is used to count the guesses the user has made. The program should always print
// the number of guesses along with the answer.
//Guess a number: 55
//The number is greater, guesses made: 1
//Guess a number: 85
//The number is lesser, guesses made: 2
//Guess a number: 77
//The number is greater, guesses made: 3
//Guess a number: 81
//The number is greater, guesses made: 4
//Guess a number: 83
//Congratulations, your guess is correct!