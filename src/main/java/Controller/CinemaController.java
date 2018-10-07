package Controller;

import Model.DTOs.CinemaDTO;
import Model.DTOs.TheatreDTO;
import Model.DatabaseEntities.Theatre;
import Services.CinemaService;
import Services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    private final CinemaService cinemaService;
    private final TheatreService theatreService;

    @Autowired
    public CinemaController(CinemaService cinemaService, TheatreService theatreService) {
        this.cinemaService = cinemaService;
        this.theatreService = theatreService;
    }

    @GetMapping("")
    public List<CinemaDTO> getCinemas(){
        CinemaDTO cinemaDTO = new CinemaDTO();
        return cinemaDTO.toDto(cinemaService.findAll(), cinemaDTO);
    }

    @GetMapping("/{cinemaId}")
    public TheatreDTO[] getSeats(@PathVariable int cinemaId){
        TheatreDTO theatreDTO = new TheatreDTO();
        return theatreDTO.toDto(theatreService.findByCinemaId(cinemaId));
    }
}
