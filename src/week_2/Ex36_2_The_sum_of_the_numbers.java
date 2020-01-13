package week_2;

import java.util.Scanner;

public class Ex36_2_The_sum_of_the_numbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        while (true) {
            int introducedNUmber = Integer.parseInt(reader.nextLine());
            int counter = introducedNUmber;
            if (introducedNUmber == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is "+sum);
                break;
            }
            sum=sum+counter;
            counter++;
        }
    }
}
//Exercise 36.2: The sum of the numbers
//Develop your number reading program by adding the following feature: the
// program should print the sum of the numbers entered by the user (without the number -1).
//Type numbers:
//5
//2
//4
//-1
//Thank you and see you later!
//The sum is 11
