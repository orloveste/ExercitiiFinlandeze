package week_1;

import java.util.Scanner;

public class Ex23_Temperatures {
    public static void main(String[] args) {
        Scanner temperatureReader = new Scanner(System.in);
        System.out.print("Add temperature C': ");
        while (true){
            double temperature = Double.parseDouble(temperatureReader.nextLine());
            if (temperature >= -30.0 && temperature <=40.0){
                Ex23_Graph.addNumber(temperature);
                System.out.println("Normal range - recorded: "+temperature);
            } /*else {
                System.out.print("Try again in Celsius -30 to 40`: ");
            }*/
        }
    }
}
//Exercise 23: Temperatures
//You will get the Graph component along with the exercise template. Graph draws graphs based on numbers that are given
// to it. You can give it numbers as follows:
//Graph.addNumber(13.0);
//
//We will create a program that draws a graph based on daily temperatures given to it.
//Exercise 23.1: Asking for numbers
//Create a program that asks the user to input floating point numbers (double) and then adds the numbers to the graph.
// Use the while-true structure again.
//Note: To read a double, use: double number = Double.parseDouble(reader.nextLine());
//Exercise 23.2: Checking
//Improve your program so that temperatures below -30 degrees or over +40 degrees are ignored and not added to the
// graph.