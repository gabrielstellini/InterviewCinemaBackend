package Services;

import Repositories.TheatreFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreFilmService {
    private final TheatreFilmRepository theatreFilmRepository;

    @Autowired
    public TheatreFilmService(TheatreFilmRepository theatreFilmRepository) {
        this.theatreFilmRepository = theatreFilmRepository;
    }
}
