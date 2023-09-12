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
        return null;
    }
}

/*

Customer -> Frontend (Website OR Mobile App) -> Calls the backend API's

 */
