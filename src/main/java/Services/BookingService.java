package Services;

import Model.DatabaseEntities.Booking;
import Model.DatabaseEntities.Seat;
import Model.DatabaseEntities.TheatreFilm;
import Repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> findByBookingIdTheatreFilmId(int theatreFilmId){
        return bookingRepository.findByBookingIdTheatreFilmId(theatreFilmId);
    }

    public Booking findByTheatreFilmAndSeat(TheatreFilm theatreFilm, Seat seat) {
        return bookingRepository.findByBookingIdTheatreFilmAndBookingIdSeat(theatreFilm, seat);
    }

    public void save(Booking booking){
        bookingRepository.save(booking);
    }
}
