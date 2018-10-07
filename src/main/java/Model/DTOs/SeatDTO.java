package Model.DTOs;

public class SeatDTO {
    private Integer seatId;
    private boolean occupied;
    private Integer row;

    public SeatDTO(Integer seatId, boolean occupied) {
        this.seatId = seatId;
        this.occupied = occupied;
    }

    public SeatDTO() {
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }
}
