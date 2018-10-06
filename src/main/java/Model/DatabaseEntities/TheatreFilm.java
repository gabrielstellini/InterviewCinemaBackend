package Model.DatabaseEntities;

import javax.persistence.*;

@Entity
public class TheatreFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Film film;

    @ManyToOne
    private Theatre theatre;

    public TheatreFilm(Film film, Theatre theatre) {
        this.film = film;
        this.theatre = theatre;
    }

    public TheatreFilm() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
}
