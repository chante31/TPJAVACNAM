import afficheur.Afficheur;
import afficheur.Ecran;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Polygone {

    public static void main(String[] args) {
        Polygone polygone=new Polygone(5);
        polygone.sommets.add(new Point(1,2));
        polygone.sommets.add(new Point(4,5));
        polygone.sommets.add(new Point(3,7));
        polygone.sommets.add(new Point(2,8));
        polygone.sommets.add(new Point(5,9));
        polygone.ajouterSommet(new Point(8,5),2);

        Ecran ecran = new Ecran("polygone", 600, 400, 20);
        ecran.dessinerAxes();
        polygone.afficher();
        polygone.dessinerPolygone(ecran);
        System.out.println("\n le polygone est de degré " +polygone.getsommet());

    }
     List<Point> sommets = new ArrayList<Point>();
     private int degre;

    public Polygone(int degre){
    this.degre=degre;

    }

    public void translater(double vx, double vy){

        //List<Point>sommetranslate=new ArrayList<Point>();
        /*for (int i =0; i<this.sommets.size();i++){

            this.sommets.get(i).translater(vx,vy);
        }*/
        for (Point sommet :sommets) {
            sommet.translater(vx,vy);
        }

    }

    /**
     * Méthode qui permet d'afficher un polygone
     */
    public void afficher(){

       for(Point sommet:sommets){
           sommet.afficher();
       }
    }

    public void getperimetre(){
        double distance = 0.0;
        int len = sommets.size();
        for(int i = 0; i < len; i++) {
            distance += sommets.get(i).distance(sommets.get((i+1)%len));
    }

}

    public int getsommet() {

        return sommets.size();
    }
    
    public void ajouterSommet(Point point, int position){

      sommets.set(position,point);


    }
    public void supprimerSommet(Point point, int position){

        sommets.remove(position);
    }

    public Afficheur dessinerPolygone(Afficheur ecran){
        for(Point sommet: sommets){
           sommet.dessiner(ecran);


        }
        return ecran;
    }


    }