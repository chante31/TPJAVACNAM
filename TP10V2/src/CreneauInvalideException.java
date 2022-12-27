/**
 * CreneauInvalideException indique qu'une date n'est pas valide.
 */
public class CreneauInvalideException extends RuntimeException{ //ajout de extends RuntimeException qui est une exception non vérifié
    private static final long serialVersionUID = 1L;

    public CreneauInvalideException () {

        super("");
    }


}
