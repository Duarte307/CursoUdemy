package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadoraOption {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Informe o primeiro n�mero");
		double num1 = Double.parseDouble(valor1);
		
		String valor2 = JOptionPane.showInputDialog("Informe o segundo n�mero");
		double num2 = Double.parseDouble(valor2);
		
		String op = JOptionPane.showInputDialog("Informe a opera��o");
		
	    double resultado = "+".equals(op) ? num1 + num2 : 0;
	    resultado = "-".equals(op) ? num1 - num2 : resultado;
	    resultado = "*".equals(op) ? num1 * num2 : resultado;
	    resultado = "/".equals(op) ? num1 / num2 : resultado;
	    resultado = "%".equals(op) ? num1 % num2 : resultado;
	    
	    System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
	}
}
