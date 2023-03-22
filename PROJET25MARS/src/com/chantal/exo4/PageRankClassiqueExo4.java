package com.chantal.exo4;

import java.util.List;

public  class PageRankClassiqueExo4 {
    public static Configuration configuration(String... args) {
        Configuration config = new Configuration();
        CliConcret cli = new CliConcret();
        cli.addOption(new CommandLineOption("-K", true, "Valeur de l'indice à calculer"));
        cli.addOption(new CommandLineOption("-E", true, "Valeur de la précision à atteindre"));
        cli.addOption(new CommandLineOption("-A", true, "Valeur de alpha"));
        cli.addOption(new CommandLineOption("-C", false, "Mode matrice creuse"));
        cli.addOption(new CommandLineOption("-P", false, "Mode matrice pleine"));
       /* List<CommandLineOption> options = (List<CommandLineOption>) cli.findOption();
        for (CommandLineOption option : options) {
            String optName = option.getKey();

            boolean finOptions = false;
            int i = 0;
            while (!finOptions) {

                String arg = args[i];

                switch (optName) {

                    case "-K": {
                        config.indice = Integer.parseInt(args[++i]);
                    }

                    case "-E": {
                        config.epsilon = Double.parseDouble(args[++i]);
                    }

                    case "-A": {
                        config.alpha = Double.parseDouble(args[++i]);
                    }
                    case "-C": // Mode matrice creuse
                        config.mode = Mode.CREUSE;
                        break;
                    case "-P": // Mode matrice pleine
                        config.mode = Mode.PLEINE;
                        break;
                    default:
                        finOptions = arg.length() == 0 || arg.charAt(0) != '-';
                        if (!finOptions) {
                            System.out.println("Option inconnue : " + arg);
                        }
                }
                i++;
            }
        }
            return config;
        }*/
        return config;
    }

}