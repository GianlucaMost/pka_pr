package datenhaltung;

import logik.Kunde;

import java.util.Collection;

/**
 * Created by gianlucamost on 20.10.16.
 */
public interface KundeDAO {
    public Collection<Kunde> laden();
    public void speichern(Collection<Kunde> kunden);
}
