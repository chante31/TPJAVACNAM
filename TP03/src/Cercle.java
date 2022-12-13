import java.awt.Color;

public class Cercle implements Mesurable2D{

    public static void main(String[] args) {

        Point p1=new Point(1, 2);
        Point p2=new Point(4, 5);

        Cercle cercle1=new Cercle(p1,2.5);
        Cercle cercle2=new Cercle(p1,p2);
        System.out.println(cercle1);

    }

    private Point centre;
    private Point centre2;
    private double rayon;
    private Color color;
    //?private double diametre;

    public Cercle(Point centre, double rayon) {
        this.centre=centre;
        this.rayon=rayon;


    }
    public Cercle(Point centre, Point centre2) {
        this.centre=centre;
        this.centre2=centre2;


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
        this.rayon = rayon;
    }

    /*---------------------------est ce que cette méthode est correcte--------------------------------------------------------------*/
    public void setDiametre(double rayon) {
        this.rayon = rayon*2;
    }
    public double getDiametre() {
        return rayon*2;
    }



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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /*méhode creer cercle*/
    public void creerCercle(Point point) {

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "C"+rayon+"@"+"("+centre.getX()+","+centre.getY()+")";
    }
}