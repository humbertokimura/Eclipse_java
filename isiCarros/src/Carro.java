
public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	void exibirAnuncio() {
		System.out.println("------ Anuncio do isiCarros");
		System.out.println(" Carro: " + marca + "   " + modelo + "/" + ano);
		System.out.println(" Cor: " + cor);
		System.out.println(" Preço: R$ " + preco);
	}

	double calcularIPVA() {
		double valorIPVA;
		if (ano < 2000) {
			valorIPVA = 0.0;
		}
		else {
			valorIPVA = 0.04 * preco;
		}
				
		return valorIPVA;
	}
	
	// Nomenclatura camel case, comeca minuscula e maiusculas no começo: Para metodos e Atributos
	// Passando como parametros o desconto
	double calcularNovoPrecoComDesconto(double desconto) {
		double novoPreco = preco - (preco * desconto / 100);
		return novoPreco;
	}
}
