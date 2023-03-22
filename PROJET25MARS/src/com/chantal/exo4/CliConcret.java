package com.chantal.exo4;

import java.util.ArrayList;
import java.util.List;

public class CliConcret implements Cli{

   public List<CommandLineOption> options;

    public CliConcret() {
        this.options = new ArrayList<CommandLineOption>();
    }
    @Override
    public void addOption(CommandLineOption option) {
        options.add(option);}
   /* public CommandLineOption findOption() {
        for (CommandLineOption option : options) {
            if (option.getKey().equals(key)) {
                return option;
            }
        }
        return null;*/

}

