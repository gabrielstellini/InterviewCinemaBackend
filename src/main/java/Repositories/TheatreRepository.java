package Repositories;

import Model.DatabaseEntities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    Theatre findById(int id);

    List<Theatre> findByCinemaId(int id);
}
