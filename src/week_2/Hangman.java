package week_2;

public class Hangman {
    public boolean gameOn() {
        return true;
    }
    public void printStatus(){
        System.out.println("You have not made any guesses yet.");
        System.out.println("Unused letters: abcdefghijklmnopqrstuvwxyz\n");
    }
    public static void printWord() {
        StringBuilder unknownWord = new StringBuilder("?????????");
        System.out.println("Word to be guessed: " + unknownWord+ "\n");
    }
    public void printMan() {
        System.out.println(" __ __");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("/|");
    }
    public void guess(String letter) {
        String secretWord = "christmas";
        if (secretWord.contains(letter)) {
            System.out.println("The letter \'" + letter + "\' was found in the word.\n");
        } else {
            System.out.println("The letter \'" + letter + "\' is not in this word.\n");
        }
    }
    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
