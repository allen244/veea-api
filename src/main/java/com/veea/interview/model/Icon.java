package com.veea.interview.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Icon {
    @JsonIgnore
    private String prefix;
    @JsonIgnore
    private String suffix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return this.suffix;
    }
}
