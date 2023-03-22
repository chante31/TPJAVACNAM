package com.chantal.exo4;

public class Configuration {
    int indice = 0;
    double epsilon = 0.0;
    double alpha = 0.0;
    Mode mode = Mode.CREUSE;

    @Override public String toString() {
        return "alpha=" + alpha + ", epsilon=" + epsilon
                + ", indice=" + indice + ", mode=" + mode;
    }
}
