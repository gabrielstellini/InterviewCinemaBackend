package Controller;

import Model.DatabaseEntities.Theatre;
import Services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theatres")
public class TheatreController {

    private final TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("")
    public List<Theatre> getTheatres() {
        return theatreService.findAll();
    }

    @GetMapping("/{theatreId}")
    public Theatre getTheatres(@PathVariable int theatreId) {
        return theatreService.findById(theatreId);
    }

}
