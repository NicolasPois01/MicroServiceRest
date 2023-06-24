package com.example.restapi.entities;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name="date")
@XmlAccessorType(XmlAccessType.FIELD)
public class Date implements Serializable {

    @XmlAttribute(name="date_aller")
    private java.util.Date date_aller;

    @XmlAttribute(name="date_retour")
    private java.util.Date date_retour;

    public Date() {
    }

    public Date(java.util.Date date_aller, java.util.Date date_retour) {
        this.date_retour=date_retour;
        this.date_aller=date_aller;
    }

    public java.util.Date getDateAller() {
        return date_aller;
    }

    public void setDateAller(java.util.Date date_aller) {
        this.date_aller=date_aller;
    }

    public java.util.Date getDateRetour() {
        return date_retour;
    }

    public void setDateRetour(java.util.Date date_retour) {
        this.date_retour=date_retour;
    }

}