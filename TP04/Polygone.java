import afficheur.Afficheur;
import afficheur.Ecran;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Polygone {

    public static void main(String[] args) {
        Polygone polygone=new Polygone(5);
        Point p1 = new Point(3, 2);
        Point p2 = new Point(3, 6);
        Point p3 = new Point(11, 4);
        Point p4 = new Point(7, 9);
        polygone.sommets.add(p2);
        polygone.sommets.add(p1);
        polygone.sommets.add(p3);
        polygone.sommets.add(p4);
        polygone.ajouterSommet(new Point(8,5),2);

        Ecran ecran = new Ecran("polygone", 600, 400, 20);
        ecran.dessinerAxes();
        polygone.afficher();
        polygone.dessinerPolygone(ecran);
        polygone.dessinerlignePolygone(ecran);

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
      // Ligne ligne=new Ligne();
        for(Point sommet: sommets){
           sommet.dessiner(ecran);
           // sommet.dessiner(ecran.dessinerLigne(sommet.getX(),sommet.getY(),););

        }
        return ecran;
    }

    public void dessinerlignePolygone(Afficheur ecran){

        for(int i=0 ; i<sommets.size()-1;i++){

            ecran.dessinerLigne(sommets.get(i).getX(),sommets.get(i).getY(),sommets.get(i+1).getX(),sommets.get(i+1).getY(),Color.BLUE);

        }
        Point premier=sommets.get(0);
        Point dernier=sommets.get(sommets.size()-1);
        ecran.dessinerLigne(dernier.getX(), dernier.getY(), premier.getX(), premier.getY(), Color.BLUE);

    }

    }