
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	
	void imprimirFuncionario() {
		System.out.println("----- Dados do fucion�rio -----");
		System.out.println(" Nome: " + nome);
		System.out.println(" -Cargo: " + cargo);
		System.out.printf(" -Sal�rio: R$ %.2f\n\n", salario);
	}
	
	double aumentarSalario(double percentual) {
		double salarionovo;
		salarionovo = salario + salario * percentual / 100;
		return salarionovo;
	}
}
