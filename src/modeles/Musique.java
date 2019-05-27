package modeles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Musique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre, artiste;
    private int duree;

    public Musique() {
    }

    public Musique(String titre, String artiste, int duree) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Musique{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", artiste='" + artiste + '\'' +
                ", duree=" + duree +
                '}';
    }
}
