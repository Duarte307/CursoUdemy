package fundamentos.operadores;

public class DesafioOperadores {

	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou televisão de 50\" polegadas? " + comprouTv50);
		System.out.println("\nComprou televisão de 32\" polegadas? " + comprouTv32);
		System.out.println("\nFoi tomar sorvete? " + tomouSorvete);
		System.out.println("\nFicou mais saudavel? " + maisSaudavel);
	}
}
