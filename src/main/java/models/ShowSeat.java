package models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}

/*

ShowSeat => Mapping between Show and Seat

<123, 1>
<123, 2>
<123, 3>
<123, 4>
<12345, 1>
<12345, 2>
<12345, 3>

    1    ->   1
ShowSeat --- Show
    M     <-    1


 */
