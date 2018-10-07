package Controller;


import Model.DatabaseEntities.Film;
import Services.FilmService;
import Services.TheatreFilmService;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FilmControllerTests {

    //Sample test for retrieving all films

    @Test
    public void testGetFilms() {
        FilmService filmServiceMock = mock(FilmService.class);
        TheatreFilmService theatreFilmServiceMock = mock(TheatreFilmService.class);
        FilmController filmController = new FilmController(filmServiceMock, theatreFilmServiceMock);

        LinkedList<Film> films = new LinkedList<>();
        films.add(new Film("FilmName", "FilmDescr"));

        when(filmServiceMock.findAll()).thenReturn(films);

        List<Film> filmPointer = filmController.getFilms();

        assertEquals(filmPointer, films);


    }
}
