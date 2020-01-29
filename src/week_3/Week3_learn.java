package week_3;

public class Week3_learn {
    public static void main(String[] args) {
        String word = "Supercalifragilisticexpialidocious";
        System.out.println(word.substring(14));
        System.out.println(word.substring(9,20));
    }
}
//15.1 Other methods for strings
//We often want to read only a specific part of a string. A method in the String class
// called substring makes this possible. It can be used in two ways:
//String word = "Supercalifragilisticexpialidocious";
//System.out.println(word.substring(14)); //prints "listicexpialidocious"
//System.out.println(word.substring(9,20)); //prints "fragilistic"