package datenhaltung;

import logik.Artikel;

import java.util.Collection;

/**
 * Created by gianlucamost on 20.10.16.
 */
public interface ArtikelDAO {
    public Collection<Artikel> laden();
    public void speichern(Collection<Artikel> artikel);
}
