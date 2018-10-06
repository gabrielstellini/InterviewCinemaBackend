package Model.DTOs;

import Model.DatabaseEntities.Booking;
import Model.DatabaseEntities.Seat;
import Model.EntityToDto;

import java.util.List;

public class BookingDTO {
    public Integer seatId;
    public Integer theatreFilmId;

    public BookingDTO toDto(Booking booking){
        this.seatId = booking.getBookingId().getSeat().getId();
        this.theatreFilmId = booking.getBookingId().getTheatreFilm().getId();
        return this;
    }

    public BookingDTO[] toDto(List<Booking> bookings){
        BookingDTO[] bookingDTOs = new BookingDTO[bookings.size()];

        for (int i = 0; i < bookings.size(); i++) {
            bookingDTOs[i] = new BookingDTO();
            bookingDTOs[i].toDto(bookings.get(i));
        }

        return bookingDTOs;
    }

    public BookingDTO() {
    }

    public BookingDTO(Integer seatId, Integer theatreFilmId) {
        this.seatId = seatId;
        this.theatreFilmId = theatreFilmId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getTheatreFilmId() {
        return theatreFilmId;
    }

    public void setTheatreFilmId(Integer theatreFilmId) {
        this.theatreFilmId = theatreFilmId;
    }
}
