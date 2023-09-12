package repositories;

import models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    @Override
    List<ShowSeat> findAllById(Iterable<Long> longs);
    //Find all the ShowSeats by the showSeatIds.

    @Override
    ShowSeat save(ShowSeat showSeat);
    //save -> Update + Insert (Upsert)
    //If the showSeat object that we are passing in the input, isn't there in the DB
    //then insert it in the DB.
    //if ShowSeat object is present in the DB, then update the object in the DB.

}
