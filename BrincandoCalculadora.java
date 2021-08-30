package fundamentos;

import java.util.Scanner;

public class BrincandoCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Informe o primeiro número: ");
	    int num1 = entrada.nextInt();
			
	    System.out.print("Informe o segundo número: ");
		int num2 = entrada.nextInt();
			
		System.out.print("Informe a operação: ");
		String op = entrada.next();
		
		int adi = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		if(op.equals("+")) {
			System.out.println("O Resultado é = " + adi);
		}else if(op.equals("-")) {
			System.out.println("O Resultado é = " + sub);
		}else if(op.equals("*")) {
			System.out.println("O Resultado é = " + mult);
		}else if(op.equals("/")) {
			System.out.println("O Resultado é = " + div);
		}else if(op.equals("%")) {
			System.out.println("O Resultado é = " + mod);
		}else {
			System.out.println("Operação Inexistente!");
		}
		entrada.close();
	}
}
