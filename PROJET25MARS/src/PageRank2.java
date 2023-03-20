public class PageRank2 {
   /* private static final char ACCESS_K = 'K';
    private static final char ACCESS_A = 'A';
    private static final char ACCESS_E = 'E';
    private static final char ACCESS_P = 'P';
    private static final char ACCESS_C = 'C';

    private static final String DESC_K = "Indice maximal des itérations (défaut : " + Configuration.DEF_INDICE + ")";
    private static final String DESC_A = "Facteur d'amortissement (défaut : " + Configuration.DEF_ALPHA + ")";
    private static final String DESC_E = "Seuil de convergence (défaut : " + Configuration.DEF_EPSILON + ")";
    private static final String DESC_P = "Mode plein";
    private static final String DESC_C = "Mode creux (défaut)";

    private static final CommandLineParser parser = new CommandLineParser();

    static {
        parser.addOption(new ValueOption(ACCESS_K, DESC_K, String.valueOf(Configuration.DEF_INDICE)));
        parser.addOption(new ValueOption(ACCESS_A, DESC_A, String.valueOf(Configuration.DEF_ALPHA)));
        parser.addOption(new ValueOption(ACCESS_E, DESC_E, String.valueOf(Configuration.DEF_EPSILON)));
        parser.addOption(new FlagOption(ACCESS_P, DESC_P));
        parser.addOption(new FlagOption(ACCESS_C, DESC_C));
    }

    public static void main(String[] args) {
        Configuration configuration = new Configuration();

        try {
            CommandLineOption[] options = parser.parse(args);

            for (CommandLineOption option : options) {
                switch (option.getAccess()) {
                    case ACCESS_K:
                        configuration.indice = Integer.parseInt(option.getValue());
                        break;
                    case ACCESS_A:
                        configuration.alpha = Double.parseDouble(option.getValue());
                        break;
                    case ACCESS_E:
                        configuration.epsilon = Double.parseDouble(option.getValue());
                        break;
                    case ACCESS_P:
                        configuration.mode = Mode.PLEINE;
                        break;
                    case ACCESS_C:
                        configuration.mode = Mode.CREUSE;
                        break;
                }
            }
        } catch (CommandLineException e) {
            System.out.println(e.getMessage());
            System.out.println("Usage: PageRank [-K indice_max] [-A alpha] [-E epsilon] [-P] [-C]");
            System.exit(1);
        }

        // Reste du traitement*/
    }