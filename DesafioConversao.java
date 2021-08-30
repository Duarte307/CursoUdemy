package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu 1º Salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu 2º Salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu 3º Salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("A sua média de Salário é: " + soma / 3 );
		
		entrada.close();
		
	}
}
