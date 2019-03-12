package demojpa.service;

import demojpa.model.CinemaEntity;

import java.sql.SQLException;
import java.util.List;

public interface CinemaDAO {
    CinemaEntity insert(CinemaEntity product) throws SQLException;
    void update(CinemaEntity product) throws SQLException;
    void delete(CinemaEntity product) throws SQLException;
    CinemaEntity select(CinemaEntity product) throws SQLException;
    List<CinemaEntity> selectAll() throws SQLException;
}
