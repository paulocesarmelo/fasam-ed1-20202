package lista;

//Supondo que seja uma lista de números inteiros
public class ListaEncadeadaEstatica {
	
	//atributos
	int[] elementos;
	int qtdElementos = 0;
	int tamanho;
	
	public ListaEncadeadaEstatica(int tam) {
		tamanho = tam;
		elementos = new int[tamanho];
	}
	
	//métodos
	void adicionaNoInicio(int elemento) {
		
		if(qtdElementos == tamanho) {
			System.out.println("O vetor está cheio!");
		}else if(qtdElementos == 0) {
			elementos[0] = elemento;
			qtdElementos++;
		}else {
			
			//mover os elementos para frente
			for( int i = qtdElementos; i > 0; i-- ) {
				elementos[i] = elementos[i-1];
			}
			
			elementos[0] = elemento;
			qtdElementos++;
		}
		
	}
	
	void adicionaNoFinal(int elemento) {}
	
	void adicionaNaPosicao(int elemento, int posicao) {}
	
	void imprimirLista(){
		
		System.out.print("Lista: ");
		for(int i=0; i < qtdElementos; i++) {
			System.out.print(elementos[i]+"\t");
		}
		
	}
	
}
