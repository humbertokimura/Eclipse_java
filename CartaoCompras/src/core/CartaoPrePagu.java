package core;

public class CartaoPrePagu {
	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
	public CartaoPrePagu(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
			if (this.saldo >= valor) {
				this.saldo-=valor;
				return true;
			}
			return false;
	}
	
	// Dica legal para mostrar resultado de informa��o, formatando a toString()
	// O Metodo toString padr�o j� existe no tipo objeto. Mas estou remodelando o metodo toString para melhor formata��o
	public String toString() {
			return numeroCartao + "/" + nomeTitular + " val: " + anoValidade + "/" + mesValidade + " Saldo R$ " + saldo;
			
	}
			
	
}
