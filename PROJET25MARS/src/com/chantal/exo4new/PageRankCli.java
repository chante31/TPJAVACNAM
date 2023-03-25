package com.chantal.exo4new;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageRankCli implements Cli {
    private List<Option> options = new ArrayList<>();
    private Map<String, String> values = new HashMap<>();

    @Override
    public void addOption(Option option) {
        options.add(option);
    }

    public boolean hasOption(String access) {
        for (Option option : options) {
            if (option.getAccess().equals(access)) {
                return true;
            }
        }
        return false;
    }

    public String getValue(String access) {
        return values.get(access);
    }

    public List<Option> getOptions() {
        return this.options;
    }

    public void parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.startsWith("-")) {
                String access = arg.substring(1);
                String value = null;
                if (i + 1 < args.length && !args[i + 1].startsWith("-")) {
                    value = args[i + 1];
                    i++;
                }
                values.put(access, value);
            }
        }
    }

    public Configuration getConfiguration() {
        Configuration config = new Configuration();

        for (Option option : options) {
            if (hasOption(option.getAccess())) {
                String value = getValue(option.getAccess());
                if (isNumeric(value)) {
                    switch (option.getAccess()) {
                        case "K":
                            config.indice = Integer.parseInt(value);
                            break;
                        case "E":
                            config.epsilon = Double.parseDouble(value);
                            break;
                        case "A":
                            config.alpha = Double.parseDouble(value);
                            break;
                        case "C":
                            config.mode = Mode.CREUSE;
                            break;
                        case "P":
                            config.mode = Mode.PLEINE;
                            break;
                    }
                }
            }
        }

        return config;
    }

    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}