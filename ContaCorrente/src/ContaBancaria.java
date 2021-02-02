
public class ContaBancaria {

	int numeroConta;
	int digitoVerif;
	String cpfTitular;
	String nomeTitular;
	double saldo;

	void creditar(double valor) {
		saldo = saldo + valor;
	}

	void exibirInfo() {
		System.out.println("---- Dados da Conta Bancária ----");
		System.out.println("Nome : " + nomeTitular);
		System.out.println("=> Número da conta = " + numeroConta + " Dig = " + digitoVerif);
		System.out.println("   => CPF = " + cpfTitular);
		System.out.printf("   => Saldo = R$ %.2f\n\n", saldo);
	}

	double consultarSaldo() {
		// System.out.printf(" O Saldo da conta é R$ %.2f\n\n", saldo);
		return saldo;
	}

	boolean debitar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else
			return false;

	}
	
	/*
	public boolean transferir(double valor, ContaBancaria destino) {
		if (saldo >= valor) {
			this.saldo -= valor;
			
		}
		*/
	
}
