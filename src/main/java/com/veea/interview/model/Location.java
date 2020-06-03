package com.veea.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Location {
    @JsonIgnore
    private double lat;
    @JsonIgnore
    private double lng;
    @JsonIgnore
    private List<LabeledLatLngs> labeledLatLngs;
    @JsonIgnore
    private int distance;
    @JsonIgnore
    private String cc;
    @JsonIgnore
    private String city;
    @JsonIgnore
    private String state;
    @JsonIgnore
    private String country;
    @JsonIgnore
    private List<String> formattedAddress;

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLabeledLatLngs(List<LabeledLatLngs> labeledLatLngs) {
        this.labeledLatLngs = labeledLatLngs;
    }

    public List<LabeledLatLngs> getLabeledLatLngs() {
        return this.labeledLatLngs;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCc() {
        return this.cc;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setFormattedAddress(List<String> formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public List<String> getFormattedAddress() {
        return this.formattedAddress;
    }
}
