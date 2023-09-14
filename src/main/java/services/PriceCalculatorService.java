package services;

import models.Show;
import models.ShowSeat;
import models.ShowSeatType;
import repositories.ShowSeatRepository;
import repositories.ShowSeatTypeRepository;

import java.util.List;

public class PriceCalculatorService {
    private ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculatorService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(List<ShowSeat> showSeats, Show show) {
        //First get the type of the seats from showSeats -> Seats.
        //Get the price of each type from ShowSeatType.
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShow(show);
        int amount = 0;

        /*
        <123, 1> -> Type of seatId = 1 -> GOLD -> Find the price of GOLD seat from ShowSeatType.
        <123, 2>
        <123, 3>
        <123, 4>
         */

        for (ShowSeat showSeat : showSeats) {
            for (ShowSeatType showSeatType : showSeatTypes) {
                if (showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
}
