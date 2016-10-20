package logik;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class Buch extends Artikel {
    private String titel, autor, verlag;

    public Buch(String titel, String autor, String verlag) {
        this.titel = titel;
        this.autor = autor;
        this.verlag = verlag;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }
}
