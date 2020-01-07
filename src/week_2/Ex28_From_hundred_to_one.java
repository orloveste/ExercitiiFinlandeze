package week_2;

public class Ex28_From_hundred_to_one {
    public static void main(String[] args) {
        int number = 100;
        while (number >0){
            System.out.println(number);
            number--;
        }
    }
}
//Exercise 28: From hundred to one
//Create a program that prints the integers (whole numbers) from 100 to 1.
//The program output should be:
//100
//99
//98
//(many rows of numbers here)
//3
//2
//1
//
//Tip: Assign the variable you use in the condition of the loop a initial value of 100 and then subtract one on each
// iteration of the loop.