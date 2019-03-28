package sysmanager.br.com.maiorprimo;

import static org.junit.Assert.*;

import org.junit.Test;

import sysmanager.br.com.maiorprimo.MaiorPrimo;

public class MaiorPrimoTest {

	@Test
	public void testNumero1_10_Retorna7() {
		int resultado = MaiorPrimo.obterPrimos(1, 10);
		
		assertEquals(7, resultado);
	}
	
	@Test
	public void testNumEntre1_100_Retorna97() {
		int resultado = MaiorPrimo.obterPrimos(1, 100);
		
		assertEquals(97, resultado);
	}
	
	@Test
	public void testNumEntre1_96_Retorna89() {
		int resultado = MaiorPrimo.obterPrimos(1, 96);
		
		assertEquals(89, resultado);
	}
	
	@Test
	public void testNumEntre1_1000_Retorna997() {
		int resultado = MaiorPrimo.obterPrimos(1, 1000);
		
		assertEquals(997, resultado);
	}
	
	@Test
	public void testNumero1_982_Retorna977() {
		int resultado = MaiorPrimo.obterPrimos(1, 982);
		assertEquals(977, resultado);
	}
	
	@Test
	public void testEntre131_163_Retorna163() {
		int resultado = MaiorPrimo.obterPrimos(131, 163);
		assertEquals(163, resultado);
	}

}
