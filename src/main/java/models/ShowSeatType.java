package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;
    private SeatType seatType;
    private int price;
}

/*

ShowSeatType :

<123, GOLD>
<123, SILVER>
<123, PLATINUM>
<1234, GOLD>
<1234, PLATINUM>

     1        ->   1
ShowSeatType  --- Show
      M      <-     1

 */
