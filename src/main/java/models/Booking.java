package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseModel { //Ticket.
    private User user;
    private List<ShowSeat> showSeats;
    private int amount;
    private BookingStatus bookingStatus;
    private Date bookedDate;
    private List<Payment> payments;
}
