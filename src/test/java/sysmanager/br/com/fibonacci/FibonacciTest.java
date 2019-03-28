package sysmanager.br.com.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testCom1Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(1);
		
		assertEquals(1, result, 0.0000);
	}
	
	@Test
	public void testCom14Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(14);
		
		assertEquals(377, result, 0.0000);
	}
	
	@Test
	public void testCom5Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(5);
		
		assertEquals(5, result, 0.0000);
	}
	
	@Test
	public void testCom8Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(8);
		
		assertEquals(21, result, 0.0000);
	}
	
	@Test
	public void testCom20Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(20);
		
		assertEquals(6765, result, 0.0000);
	}
	
	@Test
	public void testCom30Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(30);
		
		assertEquals(832040, result, 0.0000);
	}
	
	@Test
	public void testCom40Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(40);
		
		assertEquals(102334155, result, 0.0000);
	}
	
	@Test
	public void testCom49Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(49);
		
		assertEquals(7778742049D, result, 0.0000);
	}
	
	@Test
	public void testCom50Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(50);
		
		assertEquals(12586269025D, result, 0.0000);
	}
	
	@Test
	public void testCom60Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(60);
		
		assertEquals(1548008755920D, result, 0.0000);
	}
	
	@Test
	public void testCom70Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(70);
		
		assertEquals(190392490709135D, result, 0.0000);
	}
	
	@Test
	public void testCom80Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(80);
		
		assertEquals(23416728348467685D, result, 0.0000);
		
	}
	
	@Test
	public void testCom90Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(90);
		
		assertEquals(2880067194370816120D, result, 0.0000);
		
	}
	
	@Test
	public void testCom97Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(97);
		
		assertEquals(83621143489848422977D, result, 0.0000);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCom98Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(98);
		
		assertEquals(135301852344706746049D, result, 0.0000);
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCom99Itens() {
		Fibonacci fib = new Fibonacci();
		
		Double result = fib.fibonacci(99);
		
		assertEquals(218922995834555169026D , result, 0.0000);
	}

}
