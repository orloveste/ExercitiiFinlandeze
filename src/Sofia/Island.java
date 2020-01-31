package Sofia;

import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;

//http://sofia.cs.vt.edu/cs1114-ebooklet/chapter4.html
public class Island {
    public static void main(String[] args) {
        Jeroo bobby = new Jeroo();
        add(bobby);

        //get the flower
        bobby.hop(3);
        bobby.pick();

        //put the flower
        bobby.turn(RIGHT);
        bobby.hop(2);
        bobby.plant();

        //hop east
        bobby.turn(LEFT);
        bobby.hop(1);
    }

    private static void add(Jeroo bobby) {
    }
}
