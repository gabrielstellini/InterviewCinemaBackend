package Controller;

import Model.DTOs.FilmDTO;
import Model.DatabaseEntities.Film;
import Model.DatabaseEntities.TheatreFilm;
import Services.FilmService;
import Services.TheatreFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final FilmService filmService;
    private final TheatreFilmService theatreFilmService;

    @Autowired
    public FilmController(FilmService filmService, TheatreFilmService theatreFilmService) {
        this.filmService = filmService;
        this.theatreFilmService = theatreFilmService;
    }

    @GetMapping("")
    public List<Film> getFilms(){
        return filmService.findAll();
    }

    @GetMapping("/{filmId}")
    public FilmDTO getFilm(@PathVariable int filmId){
        Film film = filmService.findById(filmId);

        TheatreFilm[] theatreFilm = theatreFilmService.findByFilmId(filmId);
        int[] theatreIds = new int[theatreFilm.length];

        for (int i = 0; i < theatreFilm.length; i++) {
            theatreIds[i] = theatreFilm[i].getTheatre().getId();
        }

        FilmDTO filmDTO = new FilmDTO();
        filmDTO = filmDTO.toDto(film, filmDTO);
        filmDTO.setTheatreIds(theatreIds);

        return filmDTO;
    }


}
