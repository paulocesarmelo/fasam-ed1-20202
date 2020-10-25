package pilha;

import java.util.LinkedList;

public class PilhaDinamica {

	private LinkedList<Object> lista;
	
	public PilhaDinamica() {
		lista = new LinkedList<Object>();
	}
	
	public void empilhar(int elemento) {
		lista.addLast(elemento);
	}
	
	public Object desempilhar() {
		
		return lista.removeLast();
	}
	
	public Object topo() {
		return lista.getLast();
	}
	
	public void imprimirElementos() {
		System.out.print("Pilha: ");
		for(int i=0; i<lista.size(); i++) {
			System.out.print(lista.get(i)+"\t");
		}
		
		System.out.println();
	}
	
}
