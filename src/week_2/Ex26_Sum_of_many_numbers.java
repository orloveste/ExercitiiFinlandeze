package week_2;

import java.util.Scanner;

public class Ex26_Sum_of_many_numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Enter number for sum: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            }
            sum = sum + read;
            System.out.println("Sum now: "+ sum);
        }
        System.out.println("Sum in the end: "+ sum);
    }
}
//Exercise 26: Sum of many numbers
//Create a program that reads numbers from the user and prints their sum. The program should stop asking for
// numbers when user enters the number 0. The program should be structured like this:
//Scanner reader = new Scanner(System.in);
//int sum = 0;
//while (true) {
//    int read = Integer.parseInt(reader.nextLine());
//    if (read == 0) {
//        break;
//    }
//
//    // DO SOMETHING HERE
//
//    System.out.println("Sum now: " + sum);
//}
//
//System.out.println("Sum in the end: " + sum);
//
//The program should work as follows:
//3
//Sum now: 3
//2
//Sum now: 5
//1
//Sum now: 6
//1
//Sum now: 7
//0
//Sum in the end: 7
//