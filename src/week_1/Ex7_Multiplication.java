package week_1;

public class Ex7_Multiplication {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 8;
        int multiplication = firstNumber*secondNumber;
        System.out.println(firstNumber +" * "+ secondNumber+" = "+ multiplication);
        firstNumber = 277;
        secondNumber = 111;
        multiplication = firstNumber*secondNumber;
        System.out.println(firstNumber +" * "+ secondNumber+" = "+ multiplication);
    }
}
//Exercise 7: Multiplication
//Create a program similar to the previous one except that it multiplies the two numbers instead of adding them.
//For example, if the variables hold numbers 2 and 8, the program output should be:
//2 * 8 = 16
//
//If the variables hold numbers 277 and 111, the program output should be:
//277 * 111 = 30747
//
//What is the biggest multiplication that your program is able to calculate?
// maxim result 2,147,483,647