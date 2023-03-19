import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CLIClassiqueTest {
    public Configuration configuration;
@Before
public void setUp(){

     configuration = CLIClassique.configuration("-K", "10", "-A", ".90", "-K", "20", "-P", "-K", "30", "-C");
}
    @Test
    public void testExempleSujet() {

        assertEquals(configuration.alpha, 0.9,0);
        assertEquals(configuration.epsilon, -1.0,0);
        assertEquals(configuration.indice, 30);
        assertEquals(configuration.mode, Mode.CREUSE);
    }

    /* Test de la méthode equals
    * */
    @Test
    public void testEquals() {

        Configuration c1=new Configuration();
        Configuration c2=new Configuration();
        assertTrue(c1.equals(c2));

        c1.alpha=0.8;
        assertFalse(c1.equals(c2));

        c2.alpha=0.8;
        assertFalse(c1.equals(c2));

        c2.epsilon=-2;
        assertFalse(c1.equals(c2));

        c1.epsilon=-2;
        assertFalse(c1.equals(c2));

        c2.indice=120;
        assertFalse(c1.equals(c2));

        c2. mode=Mode.PLEINE;
        assertFalse(c1.equals(c2));

        c1.mode=Mode.PLEINE;
        assertFalse(c1.equals(c2));

    }
}
