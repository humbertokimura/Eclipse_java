
public class ContaTeste {
	public static void main(String[] args) {
	
		// Conta normal 
		ContaBancaria c1;
		ChequeEspecial c2;
		
		c1 = new ContaBancaria(1001, "Isidro", 100);
		c2 = new ChequeEspecial(2002,"Paula", 200,500);
		
		//c1.numConta = 10011;
		//c1.nomeTitular = "Isidro";
		//c1.saldo = 100;
		
		System.out.println(c1.exibirInfo());
		c1.creditar(200);
		System.out.println(c1.exibirInfo());
		if (c1.debitar(400) ) {
			System.out.println("Debito efetivado");
		} 
		else System.out.println("Debito não autorizado");;
		
		
		
		//c2.numConta = 20022;
		//c2.nomeTitular = "Paula";
		//c2.saldo = 200;
		//c2.limite = 500;
		
		System.out.println(c2.exibirInfo());
		c2.creditar(200);
		System.out.println(c2.exibirInfo());
		if (c2.debitar(750)) {
			System.out.println("Debito efetivado");
		} 
		else System.out.println("Debito não autorizado");
		
		System.out.println(c2.exibirInfo());
		
}
}
