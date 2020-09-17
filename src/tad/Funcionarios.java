package tad;

public class Funcionarios {

	//conjunto de funcionarios
	Funcionario[] funcs = new Funcionario[10];
	int qtdElementos=0;
	
	
	void adicionarFuncionario(Funcionario elemento) {	
		
		if(qtdElementos < 10) {
			funcs[qtdElementos] = elemento;
			qtdElementos++;
		}else {
			System.out.println("Vetor está cheio!");
		}
		
	}
	
}




