package ui;

import com.sun.org.apache.xpath.internal.operations.Bool;
import logik.Kunde;

import java.util.Scanner;
import java.util.function.BooleanSupplier;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class AnmeldeView {

    public static void erfrageAnmeldeinfos() {
        Kunde k = new Kunde("Mustermann", "Max", "foo@bar.de", "foo");
        String mail, pw;
        boolean error;
        Scanner si = new Scanner(System.in);
        do {
            System.out.println("Bitte gib deine E-Mail-Adresse an und bestätige mit Return.");
            mail = si.nextLine();
            System.out.println("Gib nun dein Passwort ein!");
            pw = si.nextLine();
            error=(!(mail.equals(k.getEmail()) && k.validierePasswort(pw)));
            if (error)
                anzeigenFehler();
        }while (error);
        System.out.println("Angemeldet!");
    }

    public static void anzeigenFehler() {
        System.out.println("Falsche E-Mail-Adresse oder Passwort!");
    }
}
