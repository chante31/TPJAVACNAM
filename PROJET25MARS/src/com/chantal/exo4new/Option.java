package com.chantal.exo4new;

public class Option {

    private String access;
    private String description;
    private boolean hasValue;
    private String value;

    public Option(String access, String description, boolean hasValue, String value) {
        this.access = access;
        this.description = description;
        this.hasValue = hasValue;
        this.value = value;
    }

    public String getAccess() {
        return access;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasValue() {
        return hasValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
