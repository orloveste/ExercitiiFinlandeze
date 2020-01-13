package week_2;

import java.util.Scanner;

public class Ex36_3_Summing_and_counting_the_numbers {
    public static void main(String[] args) {
        int sum = 0;
        int counterSum = sum;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        while (true) {
            int introducedNUmber = Integer.parseInt(reader.nextLine());
            int counter = introducedNUmber;
            if (introducedNUmber == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is "+sum);
                System.out.println("How many numbers: "+counterSum);
                break;
            }
            sum=sum+counter;
            counter++;
            counterSum++;
        }
    }
}
//Exercise 36.3: Summing and counting the numbers
//Develop your number reading and summing program by adding the following feature: the program should
// print how many numbers the user typed (without the number -1).
//Type numbers:
//5
//2
//4
//-1
//Thank you and see you later!
//The sum is 11
//How many numbers: 3