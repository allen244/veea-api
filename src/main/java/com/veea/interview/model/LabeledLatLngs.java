package com.veea.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LabeledLatLngs {
    @JsonIgnore
    private String label;
    @JsonIgnore
    private double lat;
    @JsonIgnore
    private double lng;

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

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
}
