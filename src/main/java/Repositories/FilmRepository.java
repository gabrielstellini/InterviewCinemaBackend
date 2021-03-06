package Repositories;

import Model.DatabaseEntities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
    Film findById(int id);
}
