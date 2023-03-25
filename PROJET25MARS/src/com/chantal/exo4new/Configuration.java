package com.chantal.exo4new;


public class Configuration {
    public int indice = 21;
    public double epsilon = 0.0;
    public double alpha = 0.0;
    public Mode mode = Mode.CREUSE;

    @Override public String toString() {
        return "alpha=" + alpha + ", epsilon=" + epsilon
                + ", indice=" + indice + ", mode=" + mode;
    }
}
