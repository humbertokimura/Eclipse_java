
public class EmpregadoTeste {
	public static void main(String[] args) {
	
		Empregado e1;
		Empregado e2;
		
		// inicializando na memoria
		e1 = new Empregado();
		e2 = new Empregado();
		
		
		e1.nome = "Jos�";
		e1.cargo = "Assistente Adm";
		e1.salario = 2000.00;
				
		e2.nome = "Julia";
		e2.cargo = "Gerente";
		e2.salario = 15500.00;
				
				
		// listar as informa��es dos compregados
				
		e1.imprimirFuncionario();
		e2.imprimirFuncionario();
		
		// dar aumento de 20% para Jos�
		
		System.out.println("Aumentar sal�rio de Jos� em 20%");
		e1.salario = e1.aumentarSalario(20);
	    e1.imprimirFuncionario();
		
}
}
