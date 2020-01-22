package week_2;

public class Hangman {
    public boolean gameOn() {
        return true;
    }
    public void printStatus(){
        System.out.println("You have not made any guesses yet.");
        //trebuie sa scoata literele din lista cand sunt utilizate
        System.out.println("Unused letters: abcdefghijklmnopqrstuvwxyz\n");
    }
    public void printWord() {
        StringBuilder unknownWord = new StringBuilder("?????????");
        //trebuie sa identific litera si sa o adaug cand este ghicita
        System.out.println("Word to be guessed: " + unknownWord+ "\n");
    }
    public void printMan() {
        //trebuie sa apara etapizat cand raspunsul este gresit - pana sunt epuizate
        System.out.println(" ____");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("/|\\");
    }
    public void guess(String letter) {
        String secretWord = "christmas";
        if (secretWord.contains(letter)) {
            System.out.println("The letter \'" + letter + "\' was found in the word.\n");
        } else {
            System.out.println("The letter \'" + letter + "\' is not in this word.\n");
        }
    }
//    public static void printMenu() {
//        System.out.println(" * menu *");
//        System.out.println("quit   - quits the game");
//        System.out.println("status  - prints the game status");
//        System.out.println("a single letter uses the letter as a guess");
//        System.out.println("an empty line prints this menu");
//    }
}
