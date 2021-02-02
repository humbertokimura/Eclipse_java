
public class Loja {
	public static void main(String[] args) {
		Produto p1;
		p1 = new Produto(1, "Computador", 2000.00);

		System.out.println(p1.exibirInfo());

		
		Produto p2;
		// p2=p1; // Não duplicou a area de memoria, apontam para os mesmos atributos.
		p2 = new Produto(p1.getId(), p1.getDescricao(), p1.getPreco()); // Aqui eu duplico a área de memoria exclusiva para p2
		p2.setPreco(2500.00);
		
		System.out.println("------ após alteração do preço de p2");
		System.out.println("p1 = " + p1.exibirInfo());
		System.out.println("p2 = " + p1.exibirInfo());
		
	}
}
