package fundamentos;

public class TiposPrimitivos {
      public static void main(String[] args) {
		// Informa��es do funcion�rio
    	  
    	// Tipos num�ricos inteiros
    	byte anosDeEmpresa = 23;
    	short numeroDeVoos = 542;
    	int id = 56789;
    	long pontosAcumulados = 3_134_845_223L;
    	
    	// Tipos num�ricos reais
    	float salario = 11_445.44F;
    	double vendasAcumuladas = 2_991_797_103.01;
    	
    	// Tipo booleano
    	boolean estaDeFerias = false; // true
    	
    	// Tipo caractere
    	char status = 'A'; // ativo
    	
    	
    	// Dias de empresa
    	System.out.println("Possui " + anosDeEmpresa * 365 + " dias de empresa");
    	
    	//N�mero de viagens
        System.out.println("Realizou " + numeroDeVoos / 2 + " viagens");
       
        // Pontos por real
        System.out.println("Acumulou " + pontosAcumulados / vendasAcumuladas + " pontos por real");
        
        // Remunera��o
        System.out.println(id + ": Recebe -> " + salario + " reais");
        
        // F�rias
        System.out.println("F�rias: " + estaDeFerias);
        
        // Status
        System.out.println("Status: " + status);
        
      }
}
