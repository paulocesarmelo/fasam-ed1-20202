package grafo;

import java.util.LinkedList;

public class Vertice {

	private Object valor;
	private int id;
	private LinkedList<Vertice> vizinhos = new LinkedList<Vertice>();
	
	public Vertice(Object valor) {
		this.valor = valor;
	}
	
	
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LinkedList<Vertice> getVizinhos() {
		return vizinhos;
	}


	public void setVizinhos(LinkedList<Vertice> vizinhos) {
		this.vizinhos = vizinhos;
	}
	
	public void addVizinhos(Vertice vizinho) {
		vizinhos.add(vizinho);
	}


	public void imprimirVertice() {
		System.out.print(valor.toString());
	}
	
	public void imprimirVizinhos() {
		for(int i = 0; i < vizinhos.size(); i++) {
			vizinhos.get(i).imprimirVertice();
			System.out.println();
		}
	}
	
}
