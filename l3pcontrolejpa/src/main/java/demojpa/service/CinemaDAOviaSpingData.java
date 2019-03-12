package demojpa.service;

import demojpa.model.CinemaEntity;
import demojpa.repository.CinemaRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Profile("springData")
public class CinemaDAOviaSpingData implements CinemaDAO {

    private final CinemaRepository cinemaRepository;

    public CinemaDAOviaSpingData(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public CinemaEntity insert(CinemaEntity product){
        return cinemaRepository.save(product);
    }

    @Override
    public void update(CinemaEntity product){
        cinemaRepository.save(product);
    }

    @Override
    public void delete(CinemaEntity product){
        cinemaRepository.delete(product);
    }

    @Override
    public CinemaEntity select(CinemaEntity product){
        return cinemaRepository.findById(product.getId()).orElse(null);
    }

    @Override
    public List<CinemaEntity> selectAll(){
        return (List<CinemaEntity>) cinemaRepository.findAll();
    }
}

