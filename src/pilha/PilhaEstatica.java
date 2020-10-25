package pilha;

import lista.ListaEncadeadaEstatica;

/*
 * Para fins de teste, criaremos a pilha estática de inteiros
 */
public class PilhaEstatica {

	private ListaEncadeadaEstatica lista;
	
	
	public PilhaEstatica(int tamanho) {
		lista = new ListaEncadeadaEstatica(tamanho);
	}
	
	public void empilhar(int elemento) {
		lista.adicionaNoFinal(elemento);
	}
	
	public int desempilhar() {
		
		int ultimoElemento = lista.pegarDoFinal();
		lista.removerDoFinal();
		
		return ultimoElemento;
	}
	
	public int topo() {
		return lista.pegarDoFinal();
	}
	
	public void imprimirElementos() {
		System.out.print("Pilha: ");
		lista.imprimirLista();
	}
	
	
}
