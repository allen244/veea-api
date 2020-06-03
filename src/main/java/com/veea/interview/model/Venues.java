package com.veea.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Venues {
    @JsonIgnore
    private String id;

    private String name;
    @JsonIgnore
    private Location location;
    @JsonIgnore
    private List<Categories> categories;
    @JsonIgnore
    private String referralId;
    @JsonIgnore
    private boolean hasPerk;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Categories> getCategories() {
        return this.categories;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public String getReferralId() {
        return this.referralId;
    }

    public void setHasPerk(boolean hasPerk) {
        this.hasPerk = hasPerk;
    }

    public boolean getHasPerk() {
        return this.hasPerk;
    }
}
