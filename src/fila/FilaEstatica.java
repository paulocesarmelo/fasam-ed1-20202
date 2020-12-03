package fila;

import lista.ListaEncadeadaEstatica;

public class FilaEstatica {

	private ListaEncadeadaEstatica lista;
	
	public FilaEstatica(int tamanho) {
		lista = new ListaEncadeadaEstatica(tamanho);
	}
	
	public void enfileirar(int elemento) {
		lista.adicionaNoFinal(elemento);
	}
	
	public int desenfileirar() {
		int elemento = lista.pegarDoInicio();
		
		lista.removerDoInicio();
		
		return elemento;
	}
	
	public int primeiro() {
		return lista.pegarDoInicio();
	}
	
	public int getTamanho() {
		return lista.getTamanho();
	}
	
	public void imprimirFila() {
		System.out.print("Fila: ");
		lista.imprimirLista();
	}
	
}
