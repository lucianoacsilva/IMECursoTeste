package mercado_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mercado.Carrinho;

class CarrinhoTest {
	
	static Carrinho carrinho;
	
	@BeforeAll
	static void oi() {
		System.out.println("Iniciando teste!!");
	}
	
	@BeforeEach
	void setup() {
		carrinho = new Carrinho();
	}

	@Test
	@DisplayName("Teste de desconto")
	void descontoTest() {
		assertEquals(90, carrinho.desconto(100));
		assertEquals(160, carrinho.desconto(200));
		assertEquals(225, carrinho.desconto(300));
		assertEquals(280, carrinho.desconto(400));
	}
	
	@AfterEach
	void sucesso() {
		System.out.println("Teste realizado com sucesso!");
	}
	
	@AfterAll
	static void tchau() {
		System.out.println("Finalizando teste!!");
	}
	

}
