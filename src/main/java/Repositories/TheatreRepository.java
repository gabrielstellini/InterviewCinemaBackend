package Repositories;

import Model.DatabaseEntities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    Theatre findById(String id);
}
