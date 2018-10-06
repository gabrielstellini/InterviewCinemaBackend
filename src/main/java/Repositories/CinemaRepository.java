package Repositories;

import Model.DatabaseEntities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    Cinema findCinemaById(String id);
    Cinema[] findCinemasByName(String name);
}
