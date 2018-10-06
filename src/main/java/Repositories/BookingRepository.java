package Repositories;

import Model.DatabaseEntities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByBookingIdTheatreFilmId(int theatreFilmId);
}
