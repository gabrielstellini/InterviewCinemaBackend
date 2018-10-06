package Model.DTOs;

import Model.DatabaseEntities.Cinema;
import Model.EntityToDto;

public class CinemaDTO extends EntityToDto<CinemaDTO, Cinema> {
    private Integer id;
    private String address;
    private String name;

    public CinemaDTO(Integer id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public CinemaDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
