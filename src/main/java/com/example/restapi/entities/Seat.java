package com.example.restapi.entities;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name="seat")
@XmlAccessorType(XmlAccessType.FIELD)
public class Seat implements Serializable{

    @XmlAttribute(name="identifier")
    private int identifier;

    @XmlAttribute(name="place_name")
    private String place_name;

    public Seat() {
    }

    public Seat(int identifier, String place_name) {
        this.identifier=identifier;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier=identifier;
    }

    public String getPlaceName() {
        return place_name;
    }

    public void setPlaceName(String place_name) {
        this.place_name=place_name;
    }

}