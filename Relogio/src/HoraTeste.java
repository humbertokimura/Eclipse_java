import javax.swing.JOptionPane;

public class HoraTeste {

	public static void main(String[] args) {
		Hora HMS1, HMS2, HMS3, HMS4;
		

		
		HMS1 = new Hora(0,30,50);
		HMS2 = new Hora(12,50,10);
		HMS3 = new Hora(05,50,10);
		HMS4 = new Hora(18,30,10);
		
		//HMS1 = new Hora();
		//HMS2 = new Hora();
		
		
		// HMS1.setTime(0, 30, 50);
		System.out.println("- Hora no formato Universal �: " + HMS1.exibirHoraUniversal());
		System.out.println("- Hora no formato Padr�o �:    " + HMS1.exibirHoraPadrao() +"\n");
		
		
		// HMS2.setTime(12, 50, 10);
		System.out.println("- Hora no formato Universal �: " + HMS2.exibirHoraUniversal());
		System.out.println("- Hora no formato Padr�o �:    " + HMS2.exibirHoraPadrao()+"\n");

		// HMS3.setTime(5, 50, 10);
		System.out.println("- Hora no formato Universal �: " + HMS3.exibirHoraUniversal());
		System.out.println("- Hora no formato Padr�o �:    " + HMS3.exibirHoraPadrao()+"\n");
		
		// HMS4.setTime(18, 30, 10);
		System.out.println("- Hora no formato Universal �: " + HMS4.exibirHoraUniversal());
		
		System.out.println("- Hora no formato Padr�o �:    " + HMS4.exibirHoraPadrao()+"\n");
		
		JOptionPane.showMessageDialog(null,"- Hora no formato Universal �: " + HMS4.exibirHoraUniversal() +"\n" +"- Hora no formato Padr�o �:    " + HMS4.exibirHoraPadrao()+"\n" );
		
	}
	
}
