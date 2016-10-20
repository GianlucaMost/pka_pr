package logik;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class Bestellung {
    private String lieferadresse;
    private Artikel artikel;
    private Kunde kunde;

    public Bestellung(String lieferadresse, Artikel artikel, Kunde kunde) {
        this.lieferadresse = lieferadresse;
        this.artikel = artikel;
        this.kunde = kunde;
    }

    public String getLieferadresse() {
        return lieferadresse;
    }

    public void setLieferadresse(String lieferadresse) {
        this.lieferadresse = lieferadresse;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
