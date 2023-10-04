
package Test;
import com.mycompany.ejerciciojenkins01.Calculador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 *
 * @author ajruiz
 */
public class CalculadorTest {
    
     private Calculador calculador;

    @BeforeEach
    public void setUp() {
        calculador = new Calculador();
    }

    @Test
    public void testSum() {
        assertEquals(6.0, calculador.sum(2.0, 3.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, calculador.subtract(5.0, 3.0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculador.multiply(2.0, 3.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculador.divide(6.0, 3.0));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculador.divide(5.0, 0.0));
    }
    
}
