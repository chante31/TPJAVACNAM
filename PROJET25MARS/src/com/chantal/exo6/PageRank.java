package com.chantal.exo6;

import com.chantal.exo6.Cli;
import com.chantal.exo6.Configuration;
import com.chantal.exo6.Option;
import com.chantal.exo6.PageRankCli;

import java.util.ArrayList;
import java.util.List;

public class PageRank {
    public static void main(String[] args) throws Exception {
         CliOutils cli =  new CliOutils();



        Option option1=new Option("K", "Valeur de l'indice à calculer", true, "7");
        Option option2 =new Option("E", "Valeur de la précision à atteindre", true, "4.5");
        Option option3= new Option("C", "Mode matrice creuse", false, "CREUSE");


        if (args.length != 1) {
            System.exit(1);
        }

        String className = args[0];


        List<Option> options = new ArrayList<>();
        options.add(option1);
        options.add(option2);
        options.add(option3);


        for (Option option :options ) {
            if (option.getAccess().equals("K")) {
                System.out.println("indice : "  + option.getValue());
            } else if (option.getAccess().equals("E")) {
                System.out.println("epsilon : "  + option.getValue());
            } else if (option.getAccess().equals("A")) {
                System.out.println("alpha : "  + option.getValue());
            } else if (option.getAccess().equals("C")) {
                System.out.println("mode : "  + option.getValue());
            }
        }
    }
}
