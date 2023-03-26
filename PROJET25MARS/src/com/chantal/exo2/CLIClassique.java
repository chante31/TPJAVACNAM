package com.chantal.exo2;

public class CLIClassique {


	public static Configuration configuration(String... args) throws IllegalArgumentException {
		Configuration config = new Configuration();
		boolean finOptions = false;
		int i = 0;
		while (i < args.length && !finOptions) {

			String arg = args[i];

			switch (arg) {

				case "-K": // Valeur de l'indice à calculer
					try {
						config.indice = Integer.parseInt(args[++i]);
					} catch (NumberFormatException e) {
						System.out.println("La valeur de l'indice n'est pas valide, veuillez entrer un nombre entier.");
						System.exit(1);
					}
					break;

				case "-E": // Valeur de la précision à atteindre
					try {
						double epsilon = Double.parseDouble(args[++i]);
						if (epsilon <= 0) {
							throw new IllegalArgumentException("La valeur de la précision doit être positive.");
						}
						config.epsilon = epsilon;
					} catch (NumberFormatException e) {
						System.out.println("La valeur de la précision n'est pas valide, veuillez entrer un nombre.");
						System.exit(1);
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
						System.exit(1);
					}
					break;

				case "-A": // Valeur de alpha
					try {
						config.alpha = Double.parseDouble(args[++i]);
					} catch (NumberFormatException e) {
						System.out.println("La valeur de alpha n'est pas valide, veuillez entrer un nombre.");
						System.exit(1);
					}
					break;

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
						System.exit(1);
					}
			}
			i++;
		}

		// Vérifie si les valeurs sont manquantes et lève une exception.
		if (config.indice == null) {
			System.out.println("Veuillez entrer une valeur pour l'indice (-K).");
			System.exit(1);
		}
		if (config.epsilon == null) {
			System.out.println("Veuillez entrer une valeur pour la précision (-E).");
			System.exit(1);
		}
		if (config.alpha == null) {
			System.out.println("Veuillez entrer une valeur pour alpha (-A).");
			System.exit(1);
		}

		return config;
	}
}
