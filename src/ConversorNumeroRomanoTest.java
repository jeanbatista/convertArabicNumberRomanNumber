import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorNumeroRomanoTest {
	
	ConversorNumeroRomano conversor = new ConversorNumeroRomano();
	
	@Test
	public void test() {
		int num = 1503;
		
		String result = this.conversor.calcular(num);
		assertEquals("MDIII", result);
	}	
}
