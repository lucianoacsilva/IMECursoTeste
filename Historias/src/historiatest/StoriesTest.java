package historiatest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import historia.Stories;

class StoriesTest {

	static Stories stories;
	
	@BeforeEach
	void setup() {
		stories = new Stories();
	}
	
	//@Disabled
	@DisplayName("Teste da ordenação de códigos")
	@Test
	void ordenaTest() {
		assertArrayEquals(new int[]{22, 34, 79, 173}, stories.ordena(new int[]{173, 34, 79, 22}));
		assertArrayEquals(new int[]{42}, stories.ordena(new int[]{42}));
		assertArrayEquals(new int[]{}, stories.ordena(new int[]{}));
	}
	
	//@Disabled
	@DisplayName("Teste da função que retira primeiro nome")
	@Test
	void primeiroNomeTest() {
		assertEquals("Luciano", stories.primeiroNome("Luciano Augusto Campagnoli da Silva"));
		assertEquals("Digite um nome!!", stories.primeiroNome(""));
	}
	
	//@Disabled
	@DisplayName("Teste da calculadora")
	@Test
	void calculadoraTest() {
		assertEquals("3", stories.calculadora(1, "+", 2));
		assertEquals("5", stories.calculadora(7, "-", 2));
		assertEquals("20", stories.calculadora(5, "*", 4));
		assertEquals("2", stories.calculadora(8, "/", 4));
		assertEquals("Erro, não se pode dividir por 0!!", stories.calculadora(6, "/", 0));
	}
	

}
