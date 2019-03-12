package demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "seance")
public class SeanceEntity {

    @Id
    @GeneratedValue(generator = "sequence_seance")
    private Long id;

    private String langue;

    private boolean soustitre;


    @ManyToOne
    @JoinColumn(
            name = "fk_id_salle",
            referencedColumnName = "id"
    )
    private SalleEntity salle;

    @OneToMany(mappedBy = "abonne")
    private List<AbonneEntity> abonne;

    @OneToOne
    @JoinColumn(
            name = "fk_id_film",
            referencedColumnName = "id"
    )
    private FilmEntity film;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public boolean isSoustitre() {
        return soustitre;
    }

    public void setSoustitre(boolean soustitre) {
        this.soustitre = soustitre;
    }

    public SalleEntity getSalle() {
        return salle;
    }

    public void setSalle(SalleEntity salle) {
        this.salle = salle;
    }

    public List<AbonneEntity> getAbonne() {
        return abonne;
    }

    public void setAbonne(List<AbonneEntity> abonne) {
        this.abonne = abonne;
    }

    public FilmEntity getFilm() {
        return film;
    }

    public void setFilm(FilmEntity film) {
        this.film = film;
    }
}



