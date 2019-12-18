package week_1;

public class Ex4_Varying_variables {
    public static void main(String[] args) {
        String chickens = "Chickens:";
        int numberOfChikens = 3;
        String bacon = "Bacon (kg):";
        double baconWeight = 5.5;
        String tractor = "A tractor:";
        String ifIsFalse = "There is none!";
        String nutshell = "In a nutshell:";
        System.out.println(chickens + ' ' + numberOfChikens);
        System.out.println(bacon + ' ' + baconWeight);
        System.out.println(tractor + ' '+ ifIsFalse);
        System.out.println(nutshell +'\n'+ numberOfChikens+'\n'+baconWeight+'\n'+ifIsFalse);
        System.out.println("++++++++++++++++++++++++");
        numberOfChikens = 9000;
        baconWeight = 0.1;
        String nameOfTractor = "Zetor";
        System.out.println(chickens + ' ' + numberOfChikens);
        System.out.println(bacon + ' ' + baconWeight);
        System.out.println(tractor + ' '+ nameOfTractor);
        System.out.println(nutshell +'\n'+ numberOfChikens+'\n'+baconWeight+'\n'+nameOfTractor);
    }
}
