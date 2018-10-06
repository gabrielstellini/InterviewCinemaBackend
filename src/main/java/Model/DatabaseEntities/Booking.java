package Model.DatabaseEntities;

import javax.persistence.*;

@Entity
public class Booking {
    @Id
    @Embedded
    BookingId bookingId;

    public Booking() {
    }

    public Booking(BookingId bookingId) {
        this.bookingId = bookingId;
    }

    public BookingId getBookingId() {
        return bookingId;
    }

    public void setBookingId(BookingId bookingId) {
        this.bookingId = bookingId;
    }
}
