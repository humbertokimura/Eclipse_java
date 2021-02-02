
public class Banco {

	public static void main(String[] args) {
	
	ContaBancaria cc1;
	ContaBancaria cc2;
	
	cc1 = new ContaBancaria();
	cc2 = new ContaBancaria();
	
	cc1.numeroConta = 11111;
	cc1.digitoVerif = 2;
	cc1.nomeTitular = "Maria das Graças";
	cc1.cpfTitular = "111.222.333-44";
	cc1.saldo = 200000.00f;
	
	cc2.numeroConta = 999999;
	cc2.digitoVerif = 0;
	cc2.nomeTitular = "João Pedro";
	cc2.cpfTitular = "999.888.777-66";
	cc2.saldo = 10000.00f;
	
		
	// mostrar os dados das contas 
	
	cc1.exibirInfo();
	cc2.exibirInfo();
	
	// creditar 
	System.out.println("Creditando 50000 reais na conta CC1");
	cc1.creditar(50000);
	cc1.exibirInfo();
	
	System.out.println("Creditando 5000 reais na conta CC2");
	cc2.creditar(5000);
	cc2.exibirInfo();
	
	
	// debitar 
	System.out.println("Tentando debitar 255000 reais na conta CC1, mas sem saldo");
	cc1.debitar(260000);
	cc1.exibirInfo();
	
	// debitar 
	System.out.println("Tentando debitar 1000 reais na conta CC2");
	cc2.debitar(1000);
	cc2.exibirInfo();
		
	
	
	}

}
