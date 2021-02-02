
public class Loja {
	public static void main(String[] args) {

		Carro c1;
		// declarei uma vari�vel do tipo Carro
		Carro c2;

		// antes de come�ar a preencher os dados, preciso criar a �rea de mem�ria
		c1 = new Carro(); // Criando o espa�o de mem�ria com o tamanho da classe Carro.
		c2 = new Carro();

		c1.marca = "Xevrol�";
		c1.modelo = "Cor�a";
		c1.cor = "Branco com detalhes em preto para real�ar a beleza";
		c1.ano = 1997;
		c1.preco = 6999.00;

		c2.marca = "Porxe";
		c2.modelo = "Kaieni";
		c2.cor = "Preta";
		c2.ano = 2019;
		c2.preco = 839999.00;

		// exibindo os anuncios
		/*
		 * System.out.println(" ===== Anuncio do isiCarros");
		 * System.out.println(" Carro: " + c1.marca + "   " + c1.modelo + "/" + c1.ano);
		 * System.out.println(" Cor: " + c1.cor ); System.out.println(" Pre�o: R$ " +
		 * c1.preco ); }
		 * 
		 * c2.exibirAnuncio();
		 */

		// Calculando IPVA

		c1.exibirAnuncio();
		double ipvaC1 = c1.calcularIPVA();
		System.out.println("para vc. que perguntou, o IPVA do deste carro � R% " + ipvaC1);

		c2.exibirAnuncio();
		double ipvaC2 = c2.calcularIPVA();
		System.out.println("para vc. que perguntou, o IPVA do deste carro � R% " + ipvaC2);

		System.out.println("O patrao ficou louco !!! Todos os carros com 10% desconto");
		double novoPreco = c2.calcularNovoPrecoComDesconto(10);
		System.out.println("O pre�o agora � R$ " + novoPreco);
	}
}
