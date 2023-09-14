package controllers;

import dtos.BookMovieRequestDto;
import dtos.BookMovieResponseDto;
import models.Booking;
import models.BookingResponseStatus;
import services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {
        BookMovieResponseDto bookMovieResponseDto = new BookMovieResponseDto();

        try {
            Booking booking = bookingService.bookMovie(bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatIds());

            bookMovieResponseDto.setBookingResponseStatus(BookingResponseStatus.SUCCESS);
            bookMovieResponseDto.setAmount(booking.getAmount());
            bookMovieResponseDto.setBookingId(booking.getId());
        } catch (Exception exception) {
            bookMovieResponseDto.setBookingResponseStatus(BookingResponseStatus.FAILURE);
        }

        return bookMovieResponseDto;
    }
}

/*

Customer -> Frontend (Website OR Mobile App) -> Calls the backend API's

 */
