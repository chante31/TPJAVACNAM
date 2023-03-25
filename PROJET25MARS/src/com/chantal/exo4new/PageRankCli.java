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

    /*public String getValue(String access) {
        return values.get(access);
    }

    public List<Option> getOptions() {
        return this.options;
    }*/
    public String getValue(String access) {
        Option option = getOption(access);
        if (option != null && option.hasValue()) {
            String value = option.getValue();
            if (value != null && !value.isEmpty()) {
                return value;
            }
        }
        return null;
    }

    public Option getOption(String access) {
        for (Option option : options) {
            if (option.getAccess().equals(access)) {
                return option;
            }
        }
        return null;
    }


    public Configuration getConfiguration() throws Exception {

            Configuration config = new Configuration();
            boolean hasCreuse = false;
            boolean hasPleine = false;
        try {
            for (Option option : options) {
                if (hasOption(option.getAccess())) {
                    String value = getValue(option.getAccess());
                    if (value != null) {
                        switch (option.getAccess()) {
                            case "K":
                                try {
                                    config.indice = Integer.parseInt(value);
                                } catch (NumberFormatException e) {
                                    System.err.println("La valeur de l'option K est invalide: " + value);
                                }
                                break;
                            case "E":
                                try {
                                    config.epsilon = Double.parseDouble(value);
                                } catch (NumberFormatException e) {
                                    System.err.println("La valeur de l'option E est invalide:: " + value);
                                }
                                break;
                            case "A":
                                try {
                                    config.alpha = Double.parseDouble(value);
                                } catch (NumberFormatException e) {
                                    System.err.println("La valeur de l'option A est invalide:: " + value);
                                }
                                break;
                            case "C":
                                config.mode = Mode.CREUSE;
                                hasCreuse = true;
                                break;
                            case "P":
                                config.mode = Mode.PLEINE;
                                hasPleine = true;
                                break;
                            default:
                                System.err.println("option inconnue: " + option.getAccess());
                        }

                    }
                }
            }
            if (hasCreuse && hasPleine) {
                throw new IllegalArgumentException("Veuillez choisir entre le mode creuse et le mode pleine");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        return config;

}


}