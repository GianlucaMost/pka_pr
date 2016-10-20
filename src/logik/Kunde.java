package logik;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class Kunde {
    private String name, vorname, email, passwort;

    public Kunde(String name, String vorname, String email, String passwort) {
        this.name = name;
        this.vorname = vorname;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public boolean validierePasswort(String pw) {
        return (passwort.equals(pw));
    }
}
