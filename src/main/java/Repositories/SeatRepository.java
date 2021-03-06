package Repositories;

import Model.DatabaseEntities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    Seat findById(int id);
    List<Seat> findByTheatreId(int theatreId);
}
