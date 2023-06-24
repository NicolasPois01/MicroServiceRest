package com.example.restapi.entities;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name="company")
@XmlAccessorType(XmlAccessType.FIELD)
public class Company implements Serializable {
    @XmlAttribute(name="identifier")
    private int identifier;

    @XmlAttribute(name="name")
    private String name;

    public Company() {
    }

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