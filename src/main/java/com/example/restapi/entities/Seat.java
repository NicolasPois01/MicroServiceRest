package com.example.restapi.entities;

public class Seat {
    private int identifier;
    private String placeName;

    public Seat(int identifier, String placeName) {
        this.identifier=identifier;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier=identifier;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName=placeName;
    }

}