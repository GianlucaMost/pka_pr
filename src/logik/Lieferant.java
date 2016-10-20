package logik;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class Lieferant {
    private String name, adresse;

    public Lieferant(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
