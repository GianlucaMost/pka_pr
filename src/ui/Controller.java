package ui;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class Controller {
    public static void main(String [] args) {
        start();
    }

    public static void start() {
        anmelden();
    }

    private static void anmelden() {
        AnmeldeView.erfrageAnmeldeinfos();
    }

}
