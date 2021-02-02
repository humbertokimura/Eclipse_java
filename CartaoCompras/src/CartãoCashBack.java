
public class CartãoCashBack extends CartaoPrePago {
	int nivel;

	public CartãoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int nivel) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.nivel = nivel;
	}
	
	
	
	public int getNivel() {
		return nivel;
	}



	public void setNivel(int nivel) {
		this.nivel = nivel;
	}



	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			
			switch (this.nivel) {
			case 1:   // Gold
				super.saldo = super.saldo + (1.08f *valor);
				break;
			case 2: 	// Silver
				super.saldo = super.saldo + (1.05f *valor);
				break;
			case 3: 	// Bronze
				super.saldo = super.saldo + (1.02f *valor);
				break;
			}				
			
			return true;
		} else
			return false;
	
			
	}

	public void adicionarCredito(double valor) {
		super.saldo += valor;
	}

	
		

	

}
