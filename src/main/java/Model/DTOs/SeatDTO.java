package Model.DTOs;

import Model.DatabaseEntities.Seat;

public class SeatDTO {
    private Integer id;
    private Integer theatreId;
    private String name;

    public SeatDTO() {
    }

    public SeatDTO(Integer id, Integer theatreId, String name) {
        this.id = id;
        this.theatreId = theatreId;
        this.name = name;
    }

    public SeatDTO toDto(Seat seat){
        this.id = seat.getId();
        this.theatreId = seat.getTheatre().getId();
        this.name = seat.getName();
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
