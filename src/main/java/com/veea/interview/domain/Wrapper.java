package com.veea.interview.domain;

import com.fasterxml.jackson.annotation.JsonFilter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@JsonFilter("nameFilter")
public class Wrapper implements Serializable {
    private static final long serialVersionUID = 1L;

    private String color;
    private int count;

    private Set<String> names = new HashSet<>();


    public Wrapper() {
    }

    public int getCount() {
        return names.size();
    }


    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }


    public void addToNames(String name) {
        this.names.add(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
