package demojpa.repository;

import demojpa.model.CinemaEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("springData")
public interface CinemaRepository extends CrudRepository<CinemaEntity, Long> {
}