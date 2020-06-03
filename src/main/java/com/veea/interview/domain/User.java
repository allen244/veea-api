package com.veea.interview.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonPropertyOrder({"firstname", "lastname", "phonenumber", "address", "color", "zipcode"})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstname;

    private String lastname;

    private String color;

    private String phonenumber;

    private String address;

    private String zipcode;


    public User() {
    }


    public User(String firstname, String lastname, String color, String phonenumber, String address, String zipcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.color = color;
        this.phonenumber = phonenumber;
        this.address = address;
        this.zipcode = zipcode;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


    @JsonIgnore
    public String getFullName() {
        return this.getFirstname() + " " + this.getLastname();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", color='" + color + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}


