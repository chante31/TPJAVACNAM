import java.awt.Color;

public class Cercle implements Mesurable2D{

    public static void main(String[] args) {

        Point p1=new Point(1, 2);
        Point p2=new Point(4, 5);

        Cercle cercle1=new Cercle(p1,2.5);

        System.out.println(cercle1);

    }

    private Point centre;

    private double rayon;
    private double diametre;

    private Color couleur;

    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double diametre) {
        assert (diametre>0);
        this.diametre = rayon*2;
    }

    public Cercle(Point centre, double rayon) {
        assert(centre != null);
        assert rayon>0;
        this.centre=centre;
        this.rayon=rayon;
        this.couleur=Color.BLUE;
    }
    public Cercle(Point c1, Point c2 ) {
        assert(c1 != null);
        assert(c2 != null);
        assert (c1.distance(c2)) !=0;
        double x = (c1.getX()+c1.getX())/2;
        double y = (c1.getY()+c2.getY())/2;
        this.rayon=c1.distance(c2)/2;
        this.diametre=c1.distance(c2);
        centre = new Point(x, y);
    }
    public Cercle(Point c1, Point c2,Color couleur ) {
        assert(c1 != null);
        assert(c2 != null);
        assert (centre !=null);
        double x = (c1.getX()+c1.getX())/2;
        double y = (c1.getY()+c2.getY())/2;
        this.centre = new Point(x, y);
        this.setCouleur(couleur);

    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        assert(couleur != null);
        this.couleur = couleur;
    }

    /**F
     *
     * @param p1
     * @param p2
     */
    public static Cercle creerCercle(Point p1, Point p2) {
       assert (p1!=null);
       assert(p2 !=null);
       double rayon = p1.distance(p2) / 2;

        double x = (p1.getX()+p2.getX())/2;
        double y = (p1.getY()+p2.getY())/2;
        Point centre = new Point(x, y);
        Cercle c = new Cercle(centre, rayon);

        return c;

    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

	/*  equivalent au setter public void changerRayon(double r) {
		this.rayon=r;
	}
	*/

    public void translater(double vx, double vy) {

        centre.translater(vx, vy);

    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        assert (rayon >0 );
        this.rayon = rayon;
    }

    /*---------------------------est ce que cette méthode est correcte--------------------------------------------------------------*/




    public Double diametre() {

        return rayon*2;
    }

    @Override
    public double perimetre() {
        // TODO Auto-generated method stub
        return 2*Math.PI*rayon;
    }

    @Override
    public double aire() {
        // TODO Auto-generated method stub
        return Math.PI*rayon*rayon;
    }



    /*méhode creer cercle*/


    public Boolean contient(Point point){
        assert point!=null;
        return centre.distance(point)<rayon;

    }
    @Override
    public String toString() {

        return "C"+rayon+"@"+"("+centre.getX()+","+centre.getY()+")";
    }



}