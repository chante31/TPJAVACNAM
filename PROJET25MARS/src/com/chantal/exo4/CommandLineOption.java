package com.chantal.exo4;

public class CommandLineOption {
    private String key;
    private boolean hasValue;
    private String description;

    public CommandLineOption(String key, boolean hasValue, String description) {
        this.key = key;
        this.hasValue = hasValue;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public boolean hasValue() {
        return hasValue;
    }

    public String getDescription() {
        return description;
    }


}

