package demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "salle")
public class SalleEntity {

    @Id
    @GeneratedValue(generator = "sequence_salle")
    private Long id;

    private int nb_places;

    @ManyToOne
    @JoinColumn(
            name = "fk_id_cinema",
            referencedColumnName = "id"
    )
    private CinemaEntity cinema;


    @OneToMany(mappedBy = "seance")
    private List<SeanceEntity> seance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNb_places() {
        return nb_places;
    }

    public void setNb_places(int nb_places) {
        this.nb_places = nb_places;
    }

    public CinemaEntity getCinema() {
        return cinema;
    }

    public void setCinema(CinemaEntity cinema) {
        this.cinema = cinema;
    }

    public List<SeanceEntity> getSeance() {
        return seance;
    }

    public void setSeance(List<SeanceEntity> seance) {
        this.seance = seance;
    }
}

