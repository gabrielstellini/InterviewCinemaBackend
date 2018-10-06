package Controller;

import Model.DatabaseEntities.Seat;
import Services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {
    private final SeatService seatService;

    @Autowired
    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    //Some theatres may have more/less seating capacity - this is the purpose of the Seat entity and api
    @GetMapping("/{theatreId}")
    public List<Seat> getSeats(@PathVariable int theatreId){
        return seatService.findByTheatreId(theatreId);
    }
}
