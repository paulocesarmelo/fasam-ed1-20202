package grafo;

import java.util.LinkedList;

public class Grafo2 {

	private LinkedList<Aresta> arestas = new LinkedList<Aresta>();

	public LinkedList<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(LinkedList<Aresta> arestas) {
		this.arestas = arestas;
	}
	
	public void addAresta(Aresta aresta) {
		arestas.add(aresta);
	}
	
	public void addVertices(Vertice origem, Vertice destino) {
		Aresta aresta = new Aresta(origem, destino);
		
		arestas.add(aresta);
	}
	
	public LinkedList<Vertice> getVizinhos(Vertice v){
		return v.getVizinhos();
	}
	
	public void imprimirGrafo() {
		
		for(int i=0; i<arestas.size(); i++) {
			arestas.get(i).imprimirAresta();
			System.out.println();
		}
		
	}
}
