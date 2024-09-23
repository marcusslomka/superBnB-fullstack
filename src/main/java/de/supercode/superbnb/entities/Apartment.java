package de.supercode.superbnb.entities;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String adress;
    private BigInteger costsPerNight;
    private boolean available;
    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    private List<Booking> listBookings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public BigInteger getCostsPerNight() {
        return costsPerNight;
    }

    public void setCostsPerNight(BigInteger costsPerNight) {
        this.costsPerNight = costsPerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
