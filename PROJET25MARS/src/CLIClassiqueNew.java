import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CLIClassiqueNew {

        public static ConfigurationNew configuration(String... args) {
            ConfigurationNew configNew = new ConfigurationNew();
            boolean finOptions = false;
            String message="Bienvenue";
            int i = 0;
            while (i < args.length && ! finOptions) {

                String arg = args[i];

                switch (arg) {

                    case "-N": // Valeur de l'indice à calculer
                        try {

                            String TEXT_FILE = "C:/temp/textFile.txt";

                            Path textFilePath = Paths.get(TEXT_FILE);
                            if (textFilePath ==null){
                            Files.createFile(textFilePath);

                            System.out.println("un fichier a été crée sous le nom ");
                            break;}
                        }catch (NumberFormatException e) {
                            System.out.println("la valeur n'est pas valide veuillez entrer un nombre" +args[i]);} catch (
                                IOException e) {
                            throw new RuntimeException(e);
                        }
                    case "-E": // Valeur de la précision à atteindre
                        try {

                            FileWriter fw = new FileWriter("C:/temp/textFile.txt");
                            fw.write(message);
                            fw.close();
                            //fl.insert(config.message)
                            System.out.println("Le texte a été écrit avec succès, veuillez verifier dans votre fichier Temp");
                            break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                }
                i++;
            }

            return configNew;
        }
    }


