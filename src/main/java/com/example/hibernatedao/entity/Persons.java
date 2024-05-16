package com.example.hibernatedao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Persons {
    @EmbeddedId
    private Man man;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;

    public Persons() {
    }

    public Man getMan() {
        return man;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}
