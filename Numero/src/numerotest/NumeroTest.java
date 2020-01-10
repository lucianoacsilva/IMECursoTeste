package numerotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import numero.Numero;

class NumeroTest {

	@Test
	public void checaIgualdadeTest() {
		Numero numero = new Numero();
		
		assertTrue(numero.checaIgualdade(4,4));
		assertFalse(numero.checaIgualdade(6,9));
	}
	
}
