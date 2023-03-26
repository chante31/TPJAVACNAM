package com.chantal.exo2;

public class Configuration {
	public Double alpha = 0.85;
	public Double epsilon = -1.0;
	public Integer indice = 150;
	public Mode mode = Mode.CREUSE;

	public String message="Bonjour";

	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + indice + ", mode=" + mode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==this)
		{
			return true;
		}
		if(!(obj instanceof Configuration)){
			return false;
		}
		Configuration autreConfiguration=new Configuration();
		if(Double.compare(this.alpha,autreConfiguration.alpha)!=0)
		return false;
		if(Double.compare(this.epsilon, autreConfiguration.epsilon)!=0){
			return false;
		}
		if(this.indice!=autreConfiguration.indice){
			return false;

		}
		if(this.mode!=autreConfiguration.mode){
			return false;
		}
		return true;
	}

	public String getMessge(){
		return message;
	}
}
