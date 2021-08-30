package fundamentos;

public class TiposPrimitivos {
      public static void main(String[] args) {
		// Informações do funcionário
    	  
    	// Tipos numéricos inteiros
    	byte anosDeEmpresa = 23;
    	short numeroDeVoos = 542;
    	int id = 56789;
    	long pontosAcumulados = 3_134_845_223L;
    	
    	// Tipos numéricos reais
    	float salario = 11_445.44F;
    	double vendasAcumuladas = 2_991_797_103.01;
    	
    	// Tipo booleano
    	boolean estaDeFerias = false; // true
    	
    	// Tipo caractere
    	char status = 'A'; // ativo
    	
    	
    	// Dias de empresa
    	System.out.println("Possui " + anosDeEmpresa * 365 + " dias de empresa");
    	
    	//Número de viagens
        System.out.println("Realizou " + numeroDeVoos / 2 + " viagens");
       
        // Pontos por real
        System.out.println("Acumulou " + pontosAcumulados / vendasAcumuladas + " pontos por real");
        
        // Remuneração
        System.out.println(id + ": Recebe -> " + salario + " reais");
        
        // Férias
        System.out.println("Férias: " + estaDeFerias);
        
        // Status
        System.out.println("Status: " + status);
        
      }
}
