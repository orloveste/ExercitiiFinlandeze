package week_2;

import java.util.Scanner;

public class Ex36_4_Counting_the_average {
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
                System.out.println("Average: "+ ((double)sum/counterSum));
                break;
            }
            sum=sum+counter;
            counter++;
            counterSum++;
        }
    }
}
//Exercise 36.4: Counting the average
//Develop your number reading, summing and counting program by adding the following feature: the
// program should print the average of the numbers the user typed (without the number -1).
//Type numbers:
//5
//2
//4
//-1
//Thank you and see you later!
//The sum is 11
//How many numbers: 3
//Average: 3.666666666666