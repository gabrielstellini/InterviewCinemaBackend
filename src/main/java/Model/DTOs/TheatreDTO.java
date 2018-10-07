package Model.DTOs;

import Model.DatabaseEntities.Theatre;

import java.util.List;

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

    public TheatreDTO[] toDto(List<Theatre> theatres){
        TheatreDTO[] theatreDTOS = new TheatreDTO[theatres.size()];

        for (int i = 0; i < theatres.size(); i++) {
            theatreDTOS[i] = new TheatreDTO();
            theatreDTOS[i].toDto(theatres.get(i));
        }

        return theatreDTOS;
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
