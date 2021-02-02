package userinterface;

import core.CartaoPrePagu;
import core.CartaoCashBack;

public class Evento {
	public static void main(String[] args) {

		/*
		// Veja que referenciado de forma Geral, mas estanciado de forma especifica
		//
		CartaoPrePagu cartao = new CartaoCashBack("1234", "Teste", 2022, 10,0.0, 1);
		System.out.println(cartao);
		*/
		
		// Exemplo de Polimorfismo ! A mesma referencia (classe pai) pode assumir formas das classes filhas		
		// vetor de 4 referencias para objetos da classe-pai (cartao Pre Pagu)
		// Posso declarar classe do Pai, mas alocar classe Filha!
		CartaoPrePagu cartoes[];
		cartoes = new CartaoPrePagu[4];
		
		cartoes[0] = new CartaoPrePagu ("1111 1111", "Cliente PrePago", 2020, 10, 0.0);
		cartoes[1] = new CartaoCashBack ("2222 2222", "Cliente CB1   ", 2020, 10, 0.0, 2);
		cartoes[2] = new CartaoCashBack ("3333 3333", "Cliente CB2   ", 2020, 10, 0.0, 1);
		cartoes[3] = new CartaoCashBack ("4444 4444", "Cliente CB3   ", 2020, 10, 0.0, 0);
		
		for (int pos=0 ; pos<4; pos++) {
			cartoes[pos].adicionarCredito(1000.0);
			System.out.println(cartoes[pos]);
			
			cartoes[pos].comprar(100);
			System.out.println(cartoes[pos]);
		}
		
		
		
		/*
		CartaoPrePagu cpp;
		CartaoCashBack cb1, cb2, cb3;

		cpp = new CartaoPrePagu("1111 2222 3333 4444", "Isidro         ", 2022, 10, 0.0);
		
		cb1 = new CartaoCashBack("2222 333 4444 5555", "Cliente Gold   ", 2022, 10, 0.0, 0); 
		cb2 = new CartaoCashBack("2222 333 4444 6666", "Cliente Silver ", 2022, 10, 0.0, 1);
		cb3 = new CartaoCashBack("2222 333 4444 7777", "Cliente Bronze ", 2022, 10, 0.0, 2);

		// System.out.println(cpp); O Java completa automatico com .toString(), se não
		// definido na classe local, ele vai buscar na classe do pai Object
		System.out.println(cpp.toString());
		
		
		// cpp.adicionarCredito(1000.0);
		System.out.println(cpp);
		
		// cpp.comprar(100.0);
		// System.out.println(cpp);
		
		
		System.out.println("\n\n----*** Adicionado credito 1000 ----------\n");
		cpp.adicionarCredito(1000);
		cb1.adicionarCredito(1000);
		cb2.adicionarCredito(1000);
		cb3.adicionarCredito(1000);
		
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		
		System.out.println("----- Comprando coisas no valor de 100 para todos cartoes------");
		cpp.comprar(100);
		cb1.comprar(100);
		cb2.comprar(100);
		cb3.comprar(100);
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		
		
		*/
	}

}
