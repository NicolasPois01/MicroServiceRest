package com.example.restapi.entities;



public class Date {
    private java.util.Date date_aller;
    private java.util.Date date_retour;

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