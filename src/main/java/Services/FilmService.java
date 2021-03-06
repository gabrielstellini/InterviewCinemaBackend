package Services;

import Model.DatabaseEntities.Film;
import Repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> findAll(){
        return filmRepository.findAll();
    }

    public Film findById(int id) {
        return filmRepository.findById(id);
    }
}
