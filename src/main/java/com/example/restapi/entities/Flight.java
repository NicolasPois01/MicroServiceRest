package com.example.restapi.entities;

public class Flight {
    private int identifier;
    private Company company;
    private Seat seat;
    private Date date;

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