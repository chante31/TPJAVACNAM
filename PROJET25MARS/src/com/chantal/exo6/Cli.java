package com.chantal.exo6;

import com.chantal.exo4new.Option;

import java.util.List;

public interface Cli {

    void addOption(Option option);
    void addAction();


    List<com.chantal.exo6.Option> addOption(com.chantal.exo6.Option option);
}
