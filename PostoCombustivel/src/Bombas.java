import javax.swing.JOptionPane;


public class Bombas {

	public static void main(String[] args) {
	
		
		
		Posto b1, b2;
		
		b1 = new Posto("Gasolina", 4.10, 20.50, 84.05);
		b2 = new Posto("Alcool", 2.90, 15.00, 43.50);
		
		
		/* Lista de vetor 
		 * 
		 * BombaDeCombustivel lista[]; Eh o equivalente de ter BombaDeCombustivel b1, b2, b3, ....
		 * 
		 * lista = new BombaDeCombustivel[4];
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		/*
		b1.setnomeCombustivel("Gasolina");
		b1.setprecoLitro(4.10);
		b1.setqtdeLitros(20.50);
		b1.setvalorPagar(84.05);
		
		b2.setnomeCombustivel("Alcool");
		b2.setprecoLitro(2.90);
		b2.setqtdeLitros(15.00);
		b2.setvalorPagar(43.50);
		*/
		
		// Abastecer 10 litros de Gasolina 
		b1.abastecerPorLitros(10.0);
		System.out.println(b1.exibirRecibo()); 
	
		// Abastecer 20 litros de Alcool 
		b2.abastecerPorLitros(20.0);
		System.out.println(b2.exibirRecibo()); 
	
		
		/* versão 2.0 agora em formato interface trafica */
		
		b1.abastecerPorLitros(80);
		//JOptionPane.showMessageDialLog (null, b1.exibirRecibo());
		JOptionPane.showMessageDialog(null, b1.exibirRecibo());
		
	}
}
