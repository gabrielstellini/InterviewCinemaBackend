package Services;

import Model.DatabaseEntities.Theatre;
import Repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;

    @Autowired
    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public List<Theatre> findAll(){
        return theatreRepository.findAll();
    }

    public List<Theatre> findByCinemaId(int cinemaId) {
        return theatreRepository.findByCinemaId(cinemaId);
    }

    public Theatre findById(int theatreId) {
        return theatreRepository.findById(theatreId);
    }
}
