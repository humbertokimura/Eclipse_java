package core;

public class CartaoCashBack extends CartaoPrePagu {
	private int tipo; // 0 - Gold / 1 - Silver / 2 - Bronze

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	
	@Override  // É opcional, deixa mais explicito ao Editor
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			if (tipo ==0 ) {
				super.saldo += valor * 0.08; 
			}
			else if (tipo == 1) {
				super.saldo += valor * 0.05;
			}
			else if (tipo ==2) {
				super.saldo += valor * 0.02;
			}
		}
		
		return false;
	}


	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", anoValidade=" + anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
}
