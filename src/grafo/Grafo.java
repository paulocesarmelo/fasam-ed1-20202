package grafo;

public class Grafo {

	private int[][] matrizAdj;
	private int qtdVertices;
	
	public Grafo(int qtdVertices) {
		matrizAdj = new int[qtdVertices][qtdVertices];
		this.qtdVertices = qtdVertices;
	}
	
	public void inicializaGrafo() {
		for(int i=0; i<qtdVertices; i++) {
			for(int j=0; j<qtdVertices; j++) {
				matrizAdj[i][j] = 0;
				
				if(i==j) {
					matrizAdj[i][j] = 1;
				}
			}
		}
	}
	
	public void ehVizinho(int vet1, int vet2) {
		matrizAdj[vet1][vet2] = 1;
		matrizAdj[vet2][vet1] = 1;
	}
	

	public void imprimirGrafo() {
		for(int i=1; i<qtdVertices; i++) {
			for(int j=1; j<qtdVertices; j++) {
				System.out.print(matrizAdj[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
}
