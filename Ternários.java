package fundamentos.operadores;

public class Tern�rios {

	public static void main(String[] args) {
		double media = 8.6;
		String resultadoParcial = media >= 5 ? "em recupera��o." : "reprovado.";
		String resultadoFinal = media >= 7 ? "aprovado." : resultadoParcial;
		
		System.out.println("O Aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("Tem Desconto? " + resultado);
	}
}
