package fundamentos;

import java.util.Scanner;

public class BrincandoCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Informe o primeiro n�mero: ");
	    int num1 = entrada.nextInt();
			
	    System.out.print("Informe o segundo n�mero: ");
		int num2 = entrada.nextInt();
			
		System.out.print("Informe a opera��o: ");
		String op = entrada.next();
		
		int adi = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		if(op.equals("+")) {
			System.out.println("O Resultado � = " + adi);
		}else if(op.equals("-")) {
			System.out.println("O Resultado � = " + sub);
		}else if(op.equals("*")) {
			System.out.println("O Resultado � = " + mult);
		}else if(op.equals("/")) {
			System.out.println("O Resultado � = " + div);
		}else if(op.equals("%")) {
			System.out.println("O Resultado � = " + mod);
		}else {
			System.out.println("Opera��o Inexistente!");
		}
		entrada.close();
	}
}
