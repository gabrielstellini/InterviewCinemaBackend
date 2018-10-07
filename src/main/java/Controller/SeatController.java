package Controller;

import Model.DTOs.SeatDTO;
import Model.DatabaseEntities.Booking;
import Model.DatabaseEntities.Seat;
import Model.DatabaseEntities.TheatreFilm;
import Services.BookingService;
import Services.SeatService;
import Services.TheatreFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class SeatController {
    private final SeatService seatService;
    private final TheatreFilmService theatreFilmService;
    private final BookingService bookingService;

    @Autowired
    public SeatController(SeatService seatService, TheatreFilmService theatreFilmService, BookingService bookingService) {
        this.seatService = seatService;
        this.theatreFilmService = theatreFilmService;
        this.bookingService = bookingService;
    }


    @GetMapping("/{filmId}/theatre/{theatreId}/seats")
    public SeatDTO[] getSeats(@PathVariable int filmId, @PathVariable int theatreId){
        TheatreFilm theatreFilm = theatreFilmService.findByTheatreIdAndFilmId(theatreId, filmId);
        if(theatreFilm == null){
            return new SeatDTO[0];
        }

        List<Seat> seatList = seatService.findByTheatreId(theatreId);
        List<Booking> bookings = bookingService.findByBookingIdTheatreFilmId(theatreFilm.getId());

        SeatDTO[] seatsDto = new SeatDTO[seatList.size()];

        for (int i = 0; i < seatsDto.length; i++) {
            seatsDto[i] = new SeatDTO();
            seatsDto[i].setSeatId(seatList.get(i).getId());
            seatsDto[i].setRow(seatList.get(i).getRow());

            for (int j = 0; j < bookings.size(); j++) {

                if(bookings.get(j).getBookingId().getSeat().getId() == seatsDto[i].getSeatId()){
                    seatsDto[i].setOccupied(true);
                }
            }
        }

        return seatsDto;
    }
//    @GetMapping("/{theatreId}")
//    public List<Seat> getSeats(@PathVariable int theatreId){
//        return seatService.findByTheatreId(theatreId);
//    }
}
