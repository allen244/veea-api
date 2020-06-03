package com.veea.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Categories {
    @JsonIgnore
    private String id;
    @JsonIgnore
    private String name;
    @JsonIgnore
    private String pluralName;
    @JsonIgnore
    private String shortName;
    @JsonIgnore
    private Icon icon;
    @JsonIgnore
    private boolean primary;

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

    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public boolean getPrimary() {
        return this.primary;
    }
}
