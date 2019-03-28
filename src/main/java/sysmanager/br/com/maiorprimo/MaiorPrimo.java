package sysmanager.br.com.maiorprimo;

import java.util.Scanner;

public class MaiorPrimo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o menor número: ");
		int menor = scanner.nextInt();
		
		System.out.println("Digite o maior número: ");
		int maior = scanner.nextInt();
		
		System.out.println("O maior número primo é " + String.valueOf(obterPrimos(menor, maior)));
		
		scanner.close();
	}

	public static int obterPrimos(int menor, int maior) {
		
		int primo = 0;
		
		for(int i = maior; i >=menor; i--) {
			
			for(int j = i - 1; j > 2; j--) {
				int result = i % j;
				
				if(result != 0) {
					primo = i;
				}else{
					primo = 0;
					break;
				}
				
			}
			if(primo != 0) {
				return primo;
			}
		}
		
		throw new IllegalArgumentException("Não foi encontrado número primo");
	}

}