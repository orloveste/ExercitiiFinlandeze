package week_3;

public class Week3_learn {
    public static void main(String[] args) {
        String book = "Mary Poppins - and";
        String endPart = book.substring(4);

        System.out.println("Harry"+endPart);
    }
}
//15.2 Other methods for strings
//We can store the return value in a variable, because the return value of the substring
// method is of type String.
//String book = "Mary Poppins";
//String endpart = book.substring(5);
//System.out.println("Harry " + endpart); // prints "Harry Poppins"