
public class GroupeAgenda implements Agenda {

    private String nom;
    public GroupeAgenda(String nom) {
        this.nom=nom;


    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return nom ;
    }

    @Override
    public void enregistrer(int creneau, String rdv) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean annuler(int creneau) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getRendezVous(int creneau) {
        // TODO Auto-generated method stub
        return null;
    }

    public void ajouter(Agenda agenda1) {
        // TODO Auto-generated method stub

    }

    public void proposer(int i, String string){
        // TODO Auto-generated method stub

    }

}
