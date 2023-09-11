package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseModel { //Ticket.
    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> showSeats;

    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    private Date bookedDate;

    @OneToMany
    private List<Payment> payments;
}


/*
Cardinalities.

   1    ->   1
Booking --- User
    M    <-     1

   1     ->   M
Booking --- ShowSeat
   M     <-    1

   1     ->    M
Booking ---- Payment => 1:M
   1      <-   1

 */