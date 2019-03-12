package demojpa.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "film")
public class FilmEntity {

    @Id
    @GeneratedValue(generator = "sequence_film")
    private Long id;

    private String realisateur;

    private String acteur_principaux;

    private String categorie;

    private Date date_de_sortie;

    private Time duree;

    private String classification_pegi;

    @OneToMany(mappedBy = "seance")
    private List<SeanceEntity> seance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getActeur_principaux() {
        return acteur_principaux;
    }

    public void setActeur_principaux(String acteur_principaux) {
        this.acteur_principaux = acteur_principaux;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDate_de_sortie() {
        return date_de_sortie;
    }

    public void setDate_de_sortie(Date date_de_sortie) {
        this.date_de_sortie = date_de_sortie;
    }

    public Time getDuree() {
        return duree;
    }

    public void setDuree(Time duree) {
        this.duree = duree;
    }

    public String getClassification_pegi() {
        return classification_pegi;
    }

    public void setClassification_pegi(String classification_pegi) {
        this.classification_pegi = classification_pegi;
    }

    public List<SeanceEntity> getSeance() {
        return seance;
    }

    public void setSeance(List<SeanceEntity> seance) {
        this.seance = seance;
    }
}




