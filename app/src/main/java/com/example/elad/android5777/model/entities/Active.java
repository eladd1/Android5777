package com.example.elad.android5777.model.entities;

import java.util.Calendar;

/**
 * Created by Elad on 22/11/2016.
 */

public class Active {

    private KindOfAction kind;
    private String country;
    private Calendar start;
    private Calendar end;
    private double price;
    private String description;
    private int BusinessId;

    public Active(KindOfAction kind, String country, Calendar start, Calendar end, double price, String description, int businessId) {
        this.kind = kind;
        this.country = country;
        this.start = start;
        this.end = end;
        this.price = price;
        this.description = description;
        BusinessId = businessId;
    }

    public KindOfAction getKind() {
        return kind;
    }

    public void setKind(KindOfAction kind) {
        this.kind = kind;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBusinessId() {
        return BusinessId;
    }

    public void setBusinessId(int businessId) {
        BusinessId = businessId;
    }
}
