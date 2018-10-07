package Services;

import Model.DatabaseEntities.TheatreFilm;
import Repositories.TheatreFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreFilmService {
    private final TheatreFilmRepository theatreFilmRepository;

    @Autowired
    public TheatreFilmService(TheatreFilmRepository theatreFilmRepository) {
        this.theatreFilmRepository = theatreFilmRepository;
    }

    public TheatreFilm findByTheatreIdAndFilmId(int theatreId, int filmId) {
        return theatreFilmRepository.findByTheatreIdAndFilmId(theatreId, filmId);
    }

    public List<TheatreFilm> findAllByFilmId(int id) {
        return theatreFilmRepository.findAllByFilmId(id);
    }
}
