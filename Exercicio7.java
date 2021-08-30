package controle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;
		int somadorDeNumeros = 0;

		do {
			System.out.print("Insira um número: ");
			numero = entrada.nextInt();
			somadorDeNumeros += numero;
			System.out.printf("Soma até o momento: %d\n", somadorDeNumeros);
		} while (numero > 0);
		

		entrada.close();
	}
}
