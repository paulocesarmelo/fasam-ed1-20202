package fila;

import java.util.LinkedList;

import lista.ListaEncadeadaDinamica;

public class FilaDinamica {

	private LinkedList<Object> lista;
	
	public FilaDinamica() {
		lista = new LinkedList<Object>();
	}
	
	public void enfileirar(Object elemento) {
		lista.addLast(elemento);
	}
	
	public Object desenfileirar() {
		return lista.removeFirst();
	}
	
	public Object primeiro() {
		return lista.getFirst();
	}
	
	public int getTamanho() {
		return lista.size();
	}
	
	public void imprimir() {
		System.out.print("Fila: \t");
		System.out.println(lista.toString());
	}
	
	public void imprimirCliente() {
		System.out.print("Fila: \t");
		//System.out.println(lista.toString());
		
		for(int i=0; i<lista.size(); i++) {
			Cliente c = (Cliente) lista.get(i);
			c.imprimirCliente();
			System.out.print("\t");
		}
		System.out.println();
	}
	
}
