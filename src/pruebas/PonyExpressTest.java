package pruebas;
import static org.junit.Assert.*;
import org.junit.*;
import ponyexpress.*;
/**
 * Prueba Unitaria de PonyExpress
 * @author Emanuel Paiva
 * @version 22/08/2021 - A
 * @see 
 */
public class PonyExpressTest {
	PonyExpress prueba; 
	
	@Before 
	public void setUp() {
		prueba = new PonyExpress (new Caballo());
	}
	@After
	public void tearDown() {
		prueba = null;
	}
	@Test
	public void caballosTest() {
		assertEquals(4, prueba.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}
}
