package de.supercode.superbnb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @ManyToOne
    private Apartment apartment;

    private LocalDate dateOfBooking;
    private LocalDate dateOfCheckIn;
    private LocalDate dateOfCheckOut;


}
