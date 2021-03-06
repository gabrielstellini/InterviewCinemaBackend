package Model.DatabaseEntities;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class BookingId implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatreFilm_id")
    private TheatreFilm theatreFilm;

    public BookingId(Seat seat, TheatreFilm theatreFilm) {
        this.seat = seat;
        this.theatreFilm = theatreFilm;
    }

    public BookingId() {
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public TheatreFilm getTheatreFilm() {
        return theatreFilm;
    }

    public void setTheatreFilm(TheatreFilm theatreFilm) {
        this.theatreFilm = theatreFilm;
    }
}
