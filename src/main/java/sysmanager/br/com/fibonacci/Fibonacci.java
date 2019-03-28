package sysmanager.br.com.fibonacci;

public class Fibonacci {

	private Double num1 = 1.0, num2 = 1.0, resultado = 1.0;
	private Double soma = 2.0;

	@SuppressWarnings("finally")
	public Double fibonacci(int n) {
		
		if(n > 97) {
			throw new IllegalArgumentException("Com essa quantidade de testes o resultado não será exato!"
					+ " Tente com um número menor.");
		}

		try {

			if (n <= 2) {
				return 1.0;
			}
			
			resultado = num1 + num2;
			num1 = num2;
			num2 = resultado;
			soma = soma + resultado;
			
			fibonacci(n-1);

		} catch (Exception e) {
			System.out.println("Ocorreu um erro.");
		} finally {
			return resultado;

		}

	}

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		Fibonacci fib = new Fibonacci();
//
//		System.out.println("Digite a quantidade de testes: ");
//		int N = scanner.nextInt();
//
//		System.out.println(fib.fibonacci(N));
//
//		scanner.close();
//	}

}