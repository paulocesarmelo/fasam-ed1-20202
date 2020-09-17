package lista;

public class PrincipalLista {

	public static void main(String[] args) {
		
		ListaEncadeadaEstatica lista = new ListaEncadeadaEstatica(10);
		
		lista.adicionaNoInicio(3);
		lista.adicionaNoInicio(5);
		lista.adicionaNoInicio(10);
		
		lista.imprimirLista();
		
	}
	
	
}

