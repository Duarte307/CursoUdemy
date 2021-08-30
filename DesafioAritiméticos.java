package fundamentos.operadores;

public class DesafioAritiméticos {

	public static void main(String[] args) {
	
		int a = ((3 + 2) * 6);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		int d = b / c;
		
		int e = (1 - 5) * (2 - 7) / 2;
		int f = (int) Math.pow(e, 2);		
		
		int g = d - f;
		int h = (int) Math.pow(g, 3);		
		
		int i = 10;
		int j = (int) Math.pow(i, 3);
		int k = h / j;
		System.out.println(k);
	}
}
