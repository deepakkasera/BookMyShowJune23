package dtos;

import lombok.Getter;
import lombok.Setter;
import models.BookingResponseStatus;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.util.List;

@Getter
@Setter
public class BookMovieResponseDto {
    private Long bookingId;
    private BookingResponseStatus bookingResponseStatus;
    private int amount;
}
