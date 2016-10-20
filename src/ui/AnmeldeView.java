package ui;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class AnmeldeView {
    private String name, vorname, mail, passwort;

    public AnmeldeView(String name, String vorname, String mail, String passwort) {
        this.name = name;
        this.vorname = vorname;
        this.mail = mail;
        this.passwort = passwort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public boolean validierePasswort(String pw) {
        return (passwort.equals(pw));
    }
}
