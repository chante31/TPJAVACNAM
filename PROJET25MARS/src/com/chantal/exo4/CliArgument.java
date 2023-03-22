package com.chantal.exo4;

public class CliArgument {
    public void setKey(String key) {
        this.key = key;
    }

    private String key;
    private String value;
    private String description;

    public CliArgument(String key, String value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}

