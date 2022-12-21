import afficheur.Ecran;

import java.awt.*;

/** Construire le schéma proposé dans le sujet de TP avec des points,
  * et des segments.
  *
  * @author	Xavier Crégut
  * @version	$Revision: 1.7 $
  */
public class ExempleSchema1 {

	/** Construire le schéma et le manipuler.
	  * Le schéma est affiché.
	  * @param args les arguments de la ligne de commande
	  */
	public static void main(String[] args)
	{
		// Créer les trois segments
		Point p1 = new Point(3, 2);
		Point p2 = new Point(6, 9);
		Point p3 = new Point(11, 4);
		Segment s12 = new Segment(p1, p2);
		Segment s23 = new Segment(p2, p3);
		Segment s31 = new Segment(p3, p1);

		// Créer le barycentre
		double sx = p1.getX() + p2.getX() + p3.getX();
		double sy = p1.getY() + p2.getY() + p3.getY();
		Point barycentre = new Point(sx / 3, sy / 3);

		// Afficher le schéma
		System.out.println("Le schéma est composé de : ");
		s12.afficher();		System.out.println();
		s23.afficher();		System.out.println();
		s31.afficher();		System.out.println();
		barycentre.afficher();	System.out.println();

		Ecran ecran=new Ecran("mon deuxième ecran",600,400,20);
		/*p1.dessinerDeLaClassePoint(ecran,3,2, Color.RED);
		s12.dessinerDeLaClasseSegment(ecran,3, 2,6, 9,Color.green);
		p1.translater(4,-3);*/

		p1.dessiner(ecran);
		p2.dessiner(ecran);
		p3.dessiner(ecran);
		barycentre.dessiner(ecran);

		s12.dessinerDeLaClasseSegment(ecran);
		s23.dessinerDeLaClasseSegment(ecran);
		s31.dessinerDeLaClasseSegment(ecran);


		s12.translater(4,-3);
		s23.translater(4,-3);
		s31.translater(4,-3);
		barycentre.translater(4,-3);

		s12.dessinerDeLaClasseSegment(ecran);
		s23.dessinerDeLaClasseSegment(ecran);
		s31.dessinerDeLaClasseSegment(ecran);
		barycentre.dessiner(ecran);







	}

}
