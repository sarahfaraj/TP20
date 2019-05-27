package modeles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livre {
    @Id
    @GeneratedValue
    private String id;
    private String auteur;
    private String titre;

    public Livre() { }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id='" + id + '\'' +
                ", auteur='" + auteur + '\'' +
                ", titre='" + titre + '\'' +
                '}';
    }
}
