package demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "societe")
public class SocieteEntity {

    @Id
    @GeneratedValue(generator = "sequence_societe")
    private Long id;

    @OneToMany(mappedBy ="cinema")
    private List<CinemaEntity> cinema;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CinemaEntity> getCinema() {
        return cinema;
    }

    public void setCinema(List<CinemaEntity> cinema) { this.cinema = cinema;}
}


