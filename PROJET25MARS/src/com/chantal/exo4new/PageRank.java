package com.chantal.exo4new;


public class PageRank {
    public static void main(String[] args) {
        Cli cli = new PageRankCli();

        Option optionIndice = new Option("K", "Valeur de l'indice à calculer", true, "7");
        Option optionPrecision = new Option("E", "Valeur de la précision à atteindre", true, "4.5");
        Option optionAlpha = new Option("A", "Valeur de alpha", true, "8.5");
        Option optionCreuse = new Option("C", "Mode matrice creuse", false, "C");
        Option optionPleine = new Option("P", "Mode matrice pleine", false, "P");

        cli.addOption(optionIndice);
        cli.addOption(optionPrecision);
        cli.addOption(optionAlpha);
        cli.addOption(optionCreuse);
        cli.addOption(optionPleine);

        ((PageRankCli) cli).parse(args);
        Configuration configuration = ((PageRankCli) cli).getConfiguration();
        System.out.println(configuration);
        //Configuration configuration = PageRankCli.configuration(cli.getOptions());
    }
}
