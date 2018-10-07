package Services;

import Model.DatabaseEntities.Seat;
import Repositories.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    private final SeatRepository seatRepository;

    @Autowired
    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public List<Seat> findByTheatreId(int id){
        return seatRepository.findByTheatreId(id);
    }

    public Seat findById(int id) {
        return seatRepository.findById(id);
    }
}
