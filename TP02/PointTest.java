import org.junit.*;

import java.awt.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/** Programme de test de la classe Point.
  * @author	Xavier Crégut
  * @version	1.11
  */
public class PointTest {
/**--------------------------------------Ligne modifié 42 et 44---------------------------------------------------------------*/
	public static final double EPSILON = 1e-6;
		// précision pour la comparaison entre réels.

	private Point p1;
	private Point p2;

	@Before
	public void setUp() {
		p1 = new Point(1, 2);
		p2 = new Point(4, -2);
	}

	@Test
	public void testInitialisation() {
		assertTrue(p1 != null);
		assertTrue(p2 != null);
		assertTrue(p1.getX() == 1);
		assertTrue(p1.getY() == 2);
		assertTrue(p2.getX() == 4);
		assertTrue(p2.getY() == -2);
	}

	@Test
	public void testInitialisationMieux() {
		assertNotNull(p1);
		assertNotNull(p2);
		// Remarque : faire un test d'égalité sur des réels est à éviter
		// à cause des erreurs d'arrondi.  En conséquence, il faut
		// vérifier que les deux nombres sont égaux à EPSILON près.
		// C'est ce que fait assertEquals(attendu, réel, précision)
		assertEquals(1.0, p1.getX(), EPSILON);
		assertEquals(2.0, p1.getY(), EPSILON);
		assertEquals(4.0, p2.getX(), EPSILON); //ancien code assertEquals(1.0, p2.getX(), EPSILON)
		assertEquals(-2.0, p2.getY(), EPSILON); //ancien code assertEquals(1.0, p2.getX(), EPSILON)
	}

	@Test
	public void testSetX() {
		p1.setX(10);
		assertEquals(10.0, p1.getX(), EPSILON);
		p1.setX(-5);
		assertEquals(-5.0, p1.getX(), EPSILON);
	}

	@Test
	public void testSetY() {
		p1.setY(10);
		assertEquals(10.0, p1.getY(), EPSILON);
		p1.setY(-5);
		assertEquals(-5.0, p1.getY(), EPSILON);
	}

	@Test
	public void testDistance() {
		assertEquals(0.0, p1.distance(p1), EPSILON);
		assertEquals(0.0, p2.distance(p2), EPSILON);
		assertEquals(5.0, p1.distance(p2), EPSILON);
		assertEquals(5.0, p2.distance(p1), EPSILON);
	}

	@Test
	public void testTranslater1() {
		p1.translater(2, 4);
		assertEquals(3.0, p1.getX(), EPSILON);
		assertEquals(6.0, p1.getY(), EPSILON);
	}

	@Test
	public void testTranslater2() {
		p2.translater(-2, -4);
		assertEquals(2.0, p2.getX(), EPSILON);
		assertEquals(-6.0, p2.getY(), EPSILON);
	}
/**---------------implementation des test de couleurs , couleurs verte et setcouleur-------------*/
	@Test
	public void testgetCouleur(){
		p1.getCouleur();
		p2.getCouleur();
		assertEquals(Color.green,p1.getCouleur());
		assertEquals(Color.green,p2.getCouleur());
	}

	@Test
	public void testsetCouleur(){
		p1.setCouleur(Color.blue);
		p2.setCouleur(Color.blue);
	assertEquals(Color.blue,p1.getCouleur());
	assertEquals(Color.blue,p2.getCouleur());

	}

}
