package com.scaler.bookmyshowjune23;

import models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmyshowJune23Application {
    public static void main(String[] args) {
        SpringApplication.run(BookmyshowJune23Application.class, args);
    }
}

/*
Requirement :- User should be able to book a Ticket.

Client  -> BMS API's

Client <-> BookingController -> Services -> .....
 */