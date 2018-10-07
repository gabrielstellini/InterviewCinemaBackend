package Model.DTOs;

public class BookingDTO {
    private int seatId;
    private int filmId;

    public BookingDTO(int seatId, int filmId) {
        this.seatId = seatId;
        this.filmId = filmId;
    }

    public BookingDTO() {
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}
