package lista;

//Supondo que seja uma lista de números inteiros
public class ListaEncadeadaEstatica {
	
	//atributos
	private int[] elementos;
	private int qtdElementos = 0;
	private int tamanho;
	
	public ListaEncadeadaEstatica(int tam) {
		tamanho = tam;
		elementos = new int[tamanho];
	}
	
	//métodos
	public void adicionaNoInicio(int elemento) {
		
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
	
	public void adicionaNoFinal(int elemento) {
		
		if(tamanho == qtdElementos) {
			System.out.println("A lista está cheia!");
		}else {
			
			elementos[qtdElementos] = elemento;
			qtdElementos++;
			
		}
		
	}
	
	public void adicionaNaPosicao(int elemento, int posicao) {
		
		if( posicao == 0 ) {
			adicionaNoInicio(elemento);
		}else if (posicao == qtdElementos) {
			adicionaNoFinal(elemento);
		}else {
			
			for( int i = qtdElementos; i > posicao; i-- ) {
				elementos[i] = elementos[i-1];
			}
			
			elementos[posicao] = elemento;
			qtdElementos++;
			
		}
		
	}
	
	public void removerDoInicio() {
		
		if( qtdElementos == 0) {
			System.out.println("A lista está vazia!");
		}else {
			
			if( qtdElementos == 1) {
				qtdElementos--;
			}else {
				
				for(int i=0; i < qtdElementos-1; i++) {
					elementos[i] = elementos[i+1];
				}
				
				qtdElementos--;
				
			}
			
		}
		
	}

	public void removerDoFinal() {
		
		if( qtdElementos == 0 ) {
			System.out.println("Lista está vazia!");
		}else {
			//elementos[qtdElementos-1] = 0; sendo que 0 seria um valor não permitido na lista
			qtdElementos--;
		}
	}
	
	public void removerDaPosicao(int pos) {
		
		if(qtdElementos == 0) {
			System.out.println("A lista está vazia!");
		}else {
			
			if( pos == 0) {
				removerDoInicio();
			}else if( pos == qtdElementos-1) {
				removerDoFinal();
			}else {
				
				for( int i = pos; i < qtdElementos-1; i++) {
					elementos[i] = elementos[i+1];
				}
				
				qtdElementos--;
				
			}
			
		}
		
	}
	
	public int busca(int elemento) {
		
		if(qtdElementos == 0) {
			System.out.println("Lista vazia!");
		}else {
			
			for(int i=0; i < qtdElementos; i++) {
				if(elementos[i] == elemento) {
					System.out.println("Elemento está na lista!");
					return i;
				}
			}
			
			System.out.println("Elemento não está na lista!");
			
		}
		return -1; //quando não encontrar ou quando a lista estiver vazia
		
	}
	
	public int pegarDoFinal() {
		if(qtdElementos == 0) {
			System.out.println("Lista vazia!");
		}else {
			return elementos[qtdElementos-1];
		}
		return -1;
	}
	
	public int pegarDoInicio() {
		if(qtdElementos == 0) {
			System.out.println("Lista vazia!");
		}else {
			return elementos[0];
		}
		return -1;
	}
	
	
	public int[] getElementos() {
		return elementos;
	}

	public void setElementos(int[] elementos) {
		this.elementos = elementos;
	}

	public int getQtdElementos() {
		return qtdElementos;
	}

	public void setQtdElementos(int qtdElementos) {
		this.qtdElementos = qtdElementos;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void imprimirLista(){
		
		//System.out.print("Lista: ");
		for(int i=0; i < qtdElementos; i++) {
			System.out.print(elementos[i]+"\t");
		}
		
		System.out.println("\n");
		
	}
	
}
