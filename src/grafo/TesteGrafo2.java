package grafo;

public class TesteGrafo2 {

	public static void main(String[] args) {
		
		Grafo2 g = new Grafo2();
		
		Vertice v1 = new Vertice("Goiânia");
		Vertice v2 = new Vertice("Neropolis");
		Vertice v3 = new Vertice("Anapolis");
		Vertice v4 = new Vertice("Inhumas");
		Vertice v5 = new Vertice("Senador Canedo");
		Vertice v6 = new Vertice("Jaragua");
		
		g.addVertices(v1, v2);
		g.addVertices(v1, v3);
		g.addVertices(v1, v4);
		g.addVertices(v1, v5);
		g.addVertices(v3, v6);
		
		g.imprimirGrafo();
		
		System.out.println("\nVizinhos de Goiânia: \n");
		v1.imprimirVizinhos();
		
	}
	
}
