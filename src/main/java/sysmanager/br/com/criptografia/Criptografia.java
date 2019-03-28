package sysmanager.br.com.criptografia;

import java.util.Scanner;

public class Criptografia {

	private final static String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static int indice = 0;
	private static boolean criptografar = false;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cripto = "";

		System.out.println("Digite o texto que será criptografado: ");
		String text = scanner.nextLine();

		cripto = criptografar(text);
		System.out.println("Resultado do texto criptografado: " + cripto);
		System.out.println("Resultado do texto descriptografado: " + descriptografar(cripto));

		scanner.close();
	}

	public static String criptografar(String text) {
		text = text.toUpperCase();
		String resultado = "";
		criptografar = true;

		for (int i = 0; i < text.length(); i++) {
			indice = 3;
			resultado += obterProximo(text.charAt(i));
		}

		return resultado;
	}

	public static String descriptografar(String text) {
		text = text.toUpperCase();
		String resultado = "";
		criptografar = false;

		for (int i = 0; i < text.length(); i++) {
			indice = -3;
			resultado += obterProximo(text.charAt(i));
		}

		return resultado;
	}

	private static String obterProximo(char caracter) {
		String valor = String.valueOf(caracter);

		for (int i = 0; i < LETRAS.length(); i++) {

			if (caracter == LETRAS.charAt(i)) {
				indice += i;

				if (indice >= LETRAS.length() && criptografar) {
					indice -= LETRAS.length();
				}

				if (indice < 0 && !criptografar) {
					indice = LETRAS.length() - Math.abs(indice);
				}

				valor = String.valueOf(LETRAS.charAt(indice));

				break;
			}
		}
		return valor;
	}

}
