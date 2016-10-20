package logik;

/**
 * Created by gianlucamost on 20.10.16.
 */
public class TabletPc extends Artikel {
    private String hersteller;

    public TabletPc(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
}
