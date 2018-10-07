package Controller;

import Model.DTOs.BookingDTO;
import Model.DatabaseEntities.*;
import Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;
    private final TheatreService theatreService;
    private final TheatreFilmService theatreFilmService;
    private final FilmService filmService;
    private final SeatService seatService;

    @Autowired
    public  BookingController(BookingService bookingService, TheatreService theatreService, TheatreFilmService theatreFilmService, FilmService filmService, SeatService seatService){
        this.bookingService = bookingService;
        this.theatreService = theatreService;
        this.theatreFilmService = theatreFilmService;
        this.filmService = filmService;
        this.seatService = seatService;
    }

    @PostMapping("")
    public ResponseEntity<Object> addBooking(@RequestBody BookingDTO bookingDTO){
        int seatId = bookingDTO.getSeatId();
        int filmId = bookingDTO.getFilmId();

        Seat seat = seatService.findById(seatId);


        if(seat == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        TheatreFilm theatreFilm = theatreFilmService.findByTheatreIdAndFilmId(seat.getTheatre().getId(), filmId);

        if(theatreFilm == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        BookingId bookingId = new BookingId(seat, theatreFilm);
        Booking booking = new Booking(bookingId);


        Booking duplicateBooking = bookingService.findByTheatreFilmAndSeat(theatreFilm, seat);

        if(duplicateBooking != null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        bookingService.save(booking);
        return null;
    }
}
