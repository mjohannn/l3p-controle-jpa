package demojpa.controller;

import demojpa.model.CinemaEntity;
import demojpa.service.CinemaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;


@RestController
public class CinemaController {
    private final CinemaDAO cinemaService;

    @Autowired
    public CinemaController(CinemaDAO cinemaService) {
        this.cinemaService = cinemaService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/cinema")
    public CinemaEntity post(@RequestBody CinemaEntity cinema) throws SQLException {
        return cinemaService.insert(cinema);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cinema/{id}")
    public CinemaEntity get(@PathVariable("id") Long id) throws SQLException {
        CinemaEntity cinema = new CinemaEntity();
        cinema.setId(id);
        return cinemaService.select(cinema);
    }
}




