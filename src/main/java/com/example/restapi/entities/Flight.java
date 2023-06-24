package com.example.restapi.entities;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name="flight")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flight implements Serializable {
    @XmlAttribute(name="identifier")
    private int identifier;

    @XmlElement(name="company")
    private Company company;

    @XmlElement(name="seat")
    private Seat seat;
    
    @XmlElement(name="date")
    private Date date;

    public Flight() {
    }

    public Flight(int identifier, Company company, Seat seat, Date date) {
        this.identifier=identifier;
        this.company = company;
        this.seat = seat;
        this.date=date;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier=identifier;
    }

    public Company getCompagnie() {
        return company;
    }

    public void setCompagnie(Company company) {
        this.company = company;
    }

    public Seat getPlace() {
        return seat;
    }

    public void setPlace(Seat seat) {
        this.seat = seat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date=date;
    }

}