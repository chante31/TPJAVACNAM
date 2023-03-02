import org.junit.Test;

import static org.junit.Assert.*;

public class CLIClassiqueTest {
    @Test
    public void testExempleSujet() {
        Configuration configuration = CLIClassique.configuration("-K", "10", "-A", ".90", "-K", "20", "-P", "-K", "30", "-C");
        assertEquals(configuration.alpha, 0.9,0);
        assertEquals(configuration.epsilon, -1.0,0);
        assertEquals(configuration.indice, 30);
        assertEquals(configuration.mode, Mode.CREUSE);
    }
}
