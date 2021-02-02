
/*  public class ChequeEspecial {
		int numConta;
		String nomeTitular;
		double saldo;
		double limite;
*/

	public class ChequeEspecial extends ContaBancaria {
		double limite;
		
		// primeira coisa é criar o construtor da classe filha pois foi feito construtor da classe super
		// a primeira linha tem de ser a chamada para o construtor da classe pai , "super"....
		public ChequeEspecial(int numConta, String nomeTitular, double saldo, double limite) {
			super(numConta, nomeTitular, saldo);
			this.limite = limite;
		}
	
	void creditar(double valor) {
		saldo += valor;
	}
	
	boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
		String exibirInfo() {
			return numConta + " - " + nomeTitular + "Saldo R$ " + saldo + "Limite R$ " + limite ;
		}
	
		
}
