package com.example.restapi.entities;

public class Company {
    private int identifier;
    private String name;

    public Company(int identifier, String name) {
        this.identifier=identifier;
        this.name=name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier=identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

}