package com.veea.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response implements Serializable {

    private List<Venues> venues;
    @JsonIgnore
    private boolean confident;

    public void setVenues(List<Venues> venues) {
        this.venues = venues;
    }

    public List<Venues> getVenues() {
        return this.venues;
    }

    public void setConfident(boolean confident) {
        this.confident = confident;
    }

    public boolean getConfident() {
        return this.confident;
    }

}
