package grafo;

public class TesteGrafo {

	public static void main(String[] args) {
		
		Grafo g = new Grafo(4);
		
		g.inicializaGrafo();
		
		g.ehVizinho(1, 2);
		g.ehVizinho(2, 3);
	
		g.imprimirGrafo();
		
	}
	
}
