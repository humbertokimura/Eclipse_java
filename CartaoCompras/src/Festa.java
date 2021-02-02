
public class Festa {
	public static void main(String[] args) {
		CartaoPrePago c1;
	
		
				
		c1 = new CartaoPrePago("1100011", "Coutinho", 2025, 8, 1000.00);
		
		// antes da festa , adicionar +1000 no cartao pre pago
		//System.out.println("O Saldo de " + c1.nomeTitular + "no Cartao: " + c1.numeroCartao + " é R$ " + c1.saldo);
		System.out.println("O Saldo de " + c1.nomeTitular + " no Cartao: " + c1.numeroCartao + " é R$ " + c1.saldo);
		
		c1.adicionarCredito(1000.00f);
		System.out.println("O Saldo de " + c1.nomeTitular + " no Cartao: " + c1.numeroCartao + " é R$ " + c1.saldo);
		
		// fazer compra de 500 
		c1.comprar(200.00);
		c1.comprar(300.00);
		System.out.println("O Saldo de " + c1.nomeTitular + " no Cartao: " + c1.numeroCartao + " é R$ " + c1.saldo);
		
		
		
		System.out.println("\n\n\n ===== Festa com CashBack \n\n");
		CartãoCashBack c2;
		c2 = new CartãoCashBack("3300033", "Marisa", 2025, 8, 2000.00, 1);
		System.out.println("O Saldo de " + c2.nomeTitular + " no Cartao: " + c2.numeroCartao + " é R$ " + c2.saldo);
		
		c2.adicionarCredito(1000.00f);
		System.out.println("O Saldo de " + c2.nomeTitular + " no Cartao: " + c2.numeroCartao + " é R$ " + c2.saldo);
		
		// fazer compra de 500 
		c2.comprar(0.00);
		c2.comprar(1000.00);
		System.out.println("O Saldo de " + c2.nomeTitular + " no Cartao: " + c2.numeroCartao + " é R$ " + String.format("%.2f", c2.saldo) );
		
		
	
	}
}
