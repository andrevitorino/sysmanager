package sysmanager.br.com.criptografia;

import static org.junit.Assert.*;

import org.junit.Test;

import sysmanager.br.com.criptografia.Criptografia;

public class CriptografiaTest {

	@Test
	public void test_ABC_To_DEF() {
		String result = Criptografia.criptografar("abc");
		
		assertEquals("DEF", result);
	}
	
	@Test
	public void test_ABCDAB_To_DEFGDE() {
		String result = Criptografia.criptografar("ABCDAB");
		
		assertEquals("DEFGDE", result);
	}
	
	@Test
	public void test_WXYZ_To_ZABC() {
		String result = Criptografia.criptografar("wxyz");
		
		assertEquals("ZABC", result);
	}
	
	@Test
	public void test_W1X2Y3Z_To_Z1A2B3C() {
		String result = Criptografia.criptografar("w1x2y3z");
		
		assertEquals("Z1A2B3C", result);
	}
	
	@Test
	public void testComPontosENumeros() {
		String result = Criptografia.criptografar("k23.N99vaBz00.");
		
		assertEquals("N23.Q99YDEC00.", result);
	}
	
	@Test
	public void test_Descriptografia_DEF_To_ABC() {
		String result = Criptografia.descriptografar("def");
		
		assertEquals("ABC", result);
	}
	
	@Test
	public void testDescriptografiaComPontosENumeros() {
		String result = Criptografia.descriptografar("N23.Q99YDEC00.");
		
		assertEquals("K23.N99VABZ00.", result);
	}
	
	@Test
	public void test_Descriptografar_WXYZ_To_ZABC() {
		String result = Criptografia.descriptografar("ZABC");
		
		assertEquals("WXYZ", result);
	}
	
	@Test
	public void test_Descriptografia_W1X2Y3Z_To_Z1A2B3C() {
		String result = Criptografia.descriptografar("Z1A2B3C");
		
		assertEquals("W1X2Y3Z", result);
		
	}

}
