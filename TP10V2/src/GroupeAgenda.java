import java.util.ArrayList;
import java.util.List;

public class GroupeAgenda implements Agenda {

    private String nom;
    private List <Agenda> groupe =new ArrayList<>();


    public List<Agenda> getGroupe() {
        return groupe;
    }

    public void setGroupe(List<Agenda> groupe) {
        this.groupe = groupe;
    }



    public GroupeAgenda(String nom) {
        this.nom=nom;


    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return nom ;
    }

    @Override
    public void enregistrer(int creneau, String rdv) throws Exception {
        if ( rdv == null )throw new IllegalArgumentException();
        if ( rdv.isEmpty() )throw new IllegalArgumentException("");
        if (creneau < CRENEAU_MIN | creneau > CRENEAU_MAX) throw new CreneauInvalideException();
        //if(this.rendezVous[creneau]!=null )throw new OccupeException();

        for(Agenda agenda :this.groupe){

            agenda.enregistrer(creneau,rdv);

        }



    }

    @Override
    public boolean annuler(int creneau) throws LibreException {

        boolean modifie=false;
        for (Agenda agenda:this.groupe){

            /*if (agenda.getRendezVous(creneau) != null){
                modifie = agenda.getRendezVous(creneau) == null;*/
        agenda.annuler(creneau);
            }
        return modifie;

    }

    @Override
    public String getRendezVous(int creneau) throws LibreException {

        String  rendezVous=" ";
        for(Agenda agenda :this.groupe){
           rendezVous=agenda.getRendezVous(creneau);
            if(rendezVous != null){
                break;}
        }
        return rendezVous;

    // ON Prend le rdv du premier agenda qui a ce rdv ,
       /* for(Agenda agenda :this.groupe){

            try {
                rendezVous= agenda.getRendezVous(creneau);
            }catch (LibreException ex){

            }
            if(rendezVous != null){
                break;
            }

        }*/

       /* if(rendezVous==null)throw  new LibreException();
        //on compare s'il y'a un rdv
        for(Agenda agenda :this.groupe){
            String rendezVous2= null;

            try {
                rendezVous2= agenda.getRendezVous(creneau);
            }catch (LibreException ex){

            }
            if(rendezVous2 != null){
               if(!rendezVous2.equals(rendezVous)) return null;
            }

        }*/

    }

    public void ajouter(Agenda agenda1) {
        this.groupe.add(agenda1);

    }

    public void proposer(int i, String string){
        // TODO Auto-generated method stub

    }

}
