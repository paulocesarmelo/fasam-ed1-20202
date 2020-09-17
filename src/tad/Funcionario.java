package tad;

public class Funcionario {

	//campos --> atributos
	String nome;
	int idade;
	char sexo;
	double salario;
	
	//operações --> métodos
	
	void criarFuncionario(String n, int i, char s, double sal) {
		nome = n;
		idade = i;
		sexo = s;
		salario = sal;
	}
	

	void editarFuncionario(String n, int i, char s, double sal){
		nome = n;
		idade = i;
		sexo = s;
		salario = sal;
	}
	
	void editarNome(String n) {
		nome = n;
	}
	
	void editarIdade(int i) {
		idade = i;
	}
	
	void editarSexto(char s) {
		sexo = s;
	}
	
	void editarSalario(double s) {
		salario = s;
	}
	
	String obterNome(){
		return nome;
	}
	
	int obterIdade(){
		return idade;
	}
	
	double obterSalario(){
		return salario;
	}
	
	char obterSexo() {
		return sexo;
	}
	
	void alterarSalario(double valorReajuste) {
		salario = salario + valorReajuste;
	}
	
	void imprimirCampos() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+sexo);
		System.out.println("Salario: "+salario);
		
	}
	
}



