package grafo;

public class Aresta {

	private Vertice origem, destino;

	public Aresta() {
		
	}
	
	public Aresta(Vertice origem, Vertice destino) {
		this.origem = origem;
		this.destino = destino;
		origem.addVizinhos(destino);
	}
	
	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}
	
	public void imprimirAresta() {
		origem.imprimirVertice();
		System.out.print(" -> ");
		destino.imprimirVertice();
		
	}
	
}
