
public class Posto {

	private String nomeCombustivel;
	private double precoLitro;
	private double qtdeLitros;
	private double valorPagar;
	
	// Customizando o construtor da estrutura Posto

	public Posto (String NomeComb, double precoLitro, double qtdeLitros, double valorPagar){
	this.nomeCombustivel = NomeComb;
	this.precoLitro = precoLitro;
	this.qtdeLitros = qtdeLitros;
	this.valorPagar = valorPagar;
	}



	public String getnomeCombustivel() {
		return nomeCombustivel;
	}

	public double getprecoLitro() {
		return precoLitro;
	}

	public double getqtdeLitros() {
		return qtdeLitros;
	}
	
	public double getvalorPagar() {
		return valorPagar;
	}
	
	public void setnomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public void setprecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public void setqtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}

	public void setvalorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}


	public void abastecerPorLitros(double qtde) {
		this.qtdeLitros = qtde;
		this.valorPagar = this.qtdeLitros * this.precoLitro;
	}

	public void abastecerPorValor (double total) {
		this.valorPagar = total;
		this.qtdeLitros = total / precoLitro;	
	}

	
	public String exibirRecibo() {
	
		/*
	String recibo = " ===========================\n" 
	+ "Isidrocorp - Gas and Energy       \n"
	+ "---------------------------------------\n"
	+ "   Combustivel : " + nomeCombustivel + "\n"
	+ "   Preço Litro : R$ " + String.format("%.3f", precoLitro) + "\n"
	+ "   Litros      : " + String.format("%.3f", qtdeLitros) + "\n"
	+ "   VALOR TOTAL : R$ " + String.format(("%.2f", valorPagar) + "\n"
	+ "----------------------------------------------------------------";
	
	*/
	String recibo = " ===========================\n"
			+ "Isidrocorp - Gas and Energy       \n"
			+ "---------------------------------------\n"
			+ "   Combustivel : " + nomeCombustivel + "\n"
			+ "   Preço Litro : R$ " + String.format("%.3f", precoLitro) + "\n"
			+ "   Litros      : " + String.format("%.3f", qtdeLitros) + "\n"
			+ "VALOR TOTAL : R$ " + String.format("%.2f",  valorPagar) + "\n"
			+ "---------------------------------------------------";
	
		
	
			
	return recibo;
	}
			
					
	
	
	
	
}
