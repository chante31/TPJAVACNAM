package com.chantal.exo6;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CliOutils {

    public static PageRankCli fromClass(String className) {
        Cli cli = (Cli) new PageRankCli();
        try {
            Class<?> classG = Class.forName(className);
            Field[] fields = classG.getFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                String optionAccess = fieldName.substring(0, 1).toLowerCase();
                String optionDescription = "Valeur de " + fieldName;
                boolean hasValue = true;
                String optionValue = "";
                Class<?> fieldType = field.getType();
                if (fieldType == boolean.class || fieldType == Boolean.class) {
                    cli.addOption(new Option(optionAccess.toLowerCase(),
                            "Positionner " + fieldName + " à vrai", false, ""));
                    cli.addOption(new Option(optionAccess.toUpperCase(),
                            "Positionner " + fieldName + " à faux", false, ""));
                    hasValue = false;
                }
                Option option = new Option(optionAccess, optionDescription, hasValue, optionValue);
                cli.addOption(option);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (PageRankCli) cli;
    }
}