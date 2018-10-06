package Model.DTOs;

import Model.DatabaseEntities.TheatreFilm;

public class TheatreFilmDTO {
    Integer id;
    Integer filmId;
    Integer theatreId;

    public TheatreFilmDTO toDto(TheatreFilm theatreFilm){
        this.id = theatreFilm.getId();
        this.filmId = theatreFilm.getFilm().getId();
        this.theatreId = theatreFilm.getTheatre().getId();
        return this;
    }

    public TheatreFilmDTO() {
    }

    public TheatreFilmDTO(Integer id, Integer filmId, Integer theatreId) {
        this.id = id;
        this.filmId = filmId;
        this.theatreId = theatreId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }
}
