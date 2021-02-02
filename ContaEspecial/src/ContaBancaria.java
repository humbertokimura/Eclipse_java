
public class ContaBancaria {
	protected int numConta;
	protected String nomeTitular;
	protected double saldo;
	
	
	
	
	// A classe Mae de todas as Classes é a java.lang , super classe Object()
	public ContaBancaria(int numConta, String nomeTitular, double saldo) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}


	void creditar(double valor) {
		saldo +=valor;
	}
	
	
	boolean debitar(double valor) {
		if (saldo >= valor) {
			saldo -=valor;
			return true;
		}
		return false;
	}
	
	String exibirInfo() {
		return numConta + " - " + nomeTitular + "Saldo R$ " + saldo;
	}
	
	
}
