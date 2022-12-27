/**
 * Définition d'un agenda individuel.
 */
public class AgendaIndividuel extends AgendaAbstrait {

    private String[] rendezVous;	// le texte des rendezVous


    /**
     * Créer un agenda vide (avec aucun rendez-vous).
     *
     * @param nom le nom de l'agenda
     * @throws IllegalArgumentException si nom nul ou vide
     */
    public AgendaIndividuel(String nom) {
        super(nom);
        this.rendezVous = new String[Agenda.CRENEAU_MAX + 1];






        // On gaspille une case (la première qui ne sera jamais utilisée)
        // mais on évite de nombreux « creneau - 1 »
    }


    @Override
    public void enregistrer(int creneau, String rdv)throws Exception {

// pourquoi quand on interverti le test ne fonctionne pas?---------------------------------------------------------------
        if ( rdv == null )throw new IllegalArgumentException();
        if ( rdv.isEmpty() )throw new IllegalArgumentException("");
         if (creneau < CRENEAU_MIN | creneau > CRENEAU_MAX) throw new CreneauInvalideException();
        this.rendezVous[creneau] = rdv;
    }


    @Override
    public boolean annuler(int creneau) {
        if (creneau < CRENEAU_MIN | creneau > CRENEAU_MAX) throw new CreneauInvalideException();
        boolean modifie = this.rendezVous[creneau] != null;
        this.rendezVous[creneau] = null;
        return modifie;
    }


    @Override
    public String getRendezVous(int creneau) {

        if(creneau < CRENEAU_MIN | creneau > CRENEAU_MAX)throw new CreneauInvalideException();

        return this.rendezVous[creneau];
    }


}
