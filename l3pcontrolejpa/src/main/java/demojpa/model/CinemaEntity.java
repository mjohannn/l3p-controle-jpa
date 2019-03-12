package demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "cinema")
public class CinemaEntity {
    @Id
    @GeneratedValue(generator = "sequence_cinema")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "fk_id_societe",
            referencedColumnName = "id"
    )
    private SocieteEntity societe;


    @OneToMany(mappedBy = "salle")
    private List<SalleEntity> salle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SocieteEntity getSociete() {
        return societe;
    }

    public void setSociete(SocieteEntity societe) {this.societe = societe;}

    public List<SalleEntity> getSalle() {
        return salle;
    }

    public void setSalle(List<SalleEntity> salle) { this.salle = salle;}
}










