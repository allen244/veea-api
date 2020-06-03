package com.veea.interview.model;

import java.util.List;

public class Places {


    public Places(List<Venues> places) {
        this.places = places;
    }

    private List<Venues> places;


    public List<Venues> getPlaces() {
        return places;
    }

    public void setPlaces(List<Venues> places) {
        this.places = places;
    }

}
