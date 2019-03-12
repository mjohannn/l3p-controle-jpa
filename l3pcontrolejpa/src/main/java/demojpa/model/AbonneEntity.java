package demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "abonne")
public class AbonneEntity {
    @Id
    @GeneratedValue(generator = "sequence_abonne")
    private Long id;

    private String nom;

    private Date date_de_naissance;

    @ManyToOne
    @JoinColumn(
            name = "fk_id_seance",
            referencedColumnName = "id"
    )
    private SeanceEntity seance;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public SeanceEntity getSeance() {
        return seance;
    }

    public void setSeance(SeanceEntity seance) {
        this.seance = seance;
    }
}















