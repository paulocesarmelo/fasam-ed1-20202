package tad;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//criar e instanciar objeto
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.criarFuncionario("Fulano", 25, 'm', 2500);
		func2.criarFuncionario("Maria", 22, 'f', 3000);
		
		
		System.out.println("\nFuncionario 1:\n");
		func1.imprimirCampos();
		
		System.out.println("\nFuncionario 2:\n");
		func2.imprimirCampos();
		
		func1.editarNome("Fulano da Silva");
		
		func2.editarIdade(23);
		
		System.out.println("\nFuncionario 1:\n");
		func1.imprimirCampos();
		
		System.out.println("\nFuncionario 2:\n");
		func2.imprimirCampos();
		
		func1.alterarSalario(-200);
		
		func2.alterarSalario(200);
		
		
		//quero imprimir somente o salário
		
		System.out.println("\n\nSalario do funcionario 1: \n"+func1.obterSalario());
		
		double sal2 = func2.obterSalario();
		System.out.println("Salario do funcionario 2: \n"+sal2);

		
	}
	
}
