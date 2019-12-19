package week_1;

import java.util.Scanner;

public class Ex18_Grades_and_points {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int enterPoints = Integer.parseInt(reader.nextLine());
        if ((0 <= enterPoints) && (enterPoints <= 29)){
            System.out.println("\nfailed");
        } else if ((30 <= enterPoints) && (enterPoints <= 34)){
            int grade = 1;
            System.out.println("\nGrade: "+grade);
        } else if ((35 <= enterPoints) && (enterPoints <= 39)){
            int grade = 2;
            System.out.println("\nGrade: "+grade);
        } else if ((40 <= enterPoints) && (enterPoints <= 44)){
            int grade = 3;
            System.out.println("\nGrade: "+grade);
        } else if ((45 <= enterPoints) && (enterPoints <= 49)){
            int grade = 4;
            System.out.println("\nGrade: "+grade);
        } else if ((50 <= enterPoints) && (enterPoints <= 60)){
            int grade = 5;
            System.out.println("\nGrade: "+grade);
        } else {
            System.out.println("Introduced points are not in [0-60] range, do it again!");
        }
    }
}
//Exercise 18: Grades and points
//Create a program that gives the course grade based on the following table.
//Points
//Grade
//0–29
//failed
//30–34
//1
//35–39
//2
//40–44
//3
//45–49
//4
//50–60
//5
//Example outputs:
//Type the points [0-60]: 37
//
//Grade: 2
//
//Type the points [0-60]: 51
//
//Grade: 5
//