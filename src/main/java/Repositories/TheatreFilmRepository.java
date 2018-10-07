package Repositories;

import Model.DatabaseEntities.TheatreFilm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreFilmRepository extends JpaRepository<TheatreFilm, Long> {
    TheatreFilm findById(String id);
}
