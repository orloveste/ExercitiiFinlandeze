package week_2;

import java.util.Scanner;

public class Ex36_5_Even_and_odd_numbers {
    public static void main(String[] args) {
        int sum = 0;
        int counterSum = sum;
        int evenNumberCount=0;
        int oddNumberCount=0;
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
                System.out.println("Even numbers: "+ evenNumberCount);
                System.out.println("Odd numbers: "+ oddNumberCount);
                break;
            }
            sum=sum+counter;
            counter++;
            counterSum++;
            if (introducedNUmber%2==0){
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }
        }
    }
}
//Exercise 36.5: Even and odd numbers
//Develop your program by adding the following feature: the program should print the number of even
// and odd numbers that the user typed (without the number -1).
//Type numbers:
//5
//2
//4
//-1
//Thank you and see you later!
//The sum is 11
//How many numbers: 3
//Average: 3.666666666666
//Even numbers: 2
//Odd numbers: 1