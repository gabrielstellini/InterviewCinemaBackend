package Model.DTOs;

import Model.DatabaseEntities.Film;
import Model.EntityToDto;

public class FilmDTO extends EntityToDto<FilmDTO, Film> {
    private Integer id;
    private String name;
    private String description;
    private int[] theatreIds;

    public FilmDTO(Integer id, String name, String description, int[] theatreIds) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.theatreIds = theatreIds;
    }

    public FilmDTO() {
    }

    public int[] getTheatreIds() {
        return theatreIds;
    }

    public void setTheatreIds(int[] theatreIds) {
        this.theatreIds = theatreIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
