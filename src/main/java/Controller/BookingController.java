package Controller;

import Model.DTOs.BookingDTO;
import Model.DatabaseEntities.Booking;
import Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public  BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping("/{theatreId}")
    public BookingDTO[] getBookings(@PathVariable int theatreId){
        List<Booking> bookings = bookingService.findByBookingIdTheatreFilmId(theatreId);
        BookingDTO[] bookingsDTO = new BookingDTO().toDto(bookings);
        return bookingsDTO;
    }
}
