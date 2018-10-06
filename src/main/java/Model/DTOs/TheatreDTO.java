package Model.DTOs;

import Model.DatabaseEntities.Theatre;

public class TheatreDTO {
    private Integer id;
    private int cinemaId;
    private String screenName;


    public TheatreDTO toDto(Theatre theatre){
        this.id = theatre.getId();
        this.cinemaId = theatre.getCinema().getId();
        this.screenName = theatre.getScreenName();
        return this;
    }

    public TheatreDTO() {
    }

    public TheatreDTO(Integer id, int cinemaId, String screenName) {
        this.id = id;
        this.cinemaId = cinemaId;
        this.screenName = screenName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
