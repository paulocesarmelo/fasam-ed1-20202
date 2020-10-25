package lista;

public class ListaEncadeadaDinamica {

	private Elemento primeiro;
	private int tamanho=0;
	
	
	public void adicionaNoInicio(Elemento elemento) {
		
		if(tamanho != 0) {
			elemento.setProximo(primeiro);
			primeiro = elemento;
		}else {
			primeiro = elemento;
		}
		
		tamanho++;
		
	}
	
	public void adicionaNoFinal(Elemento elemento) {
		
		
		if(tamanho != 0) {
			
			Elemento elem = primeiro;
			
			//percorre a lista até o último elemento
			while ( elem.getProximo() != null) {
				elem = elem.getProximo();
			}
			
			
			//insere o novo elemento como sendo o próximo do último (atual)
			elem.setProximo(elemento);
			
			
		}else {
			primeiro = elemento;
		}
		
		tamanho++;
		
	}
	
	public void adicionaNaPosicao(Elemento elemento, int posicao) {
		
		if(posicao == 1) {
			adicionaNoInicio(elemento);
		}else if(posicao == tamanho+1) {
			adicionaNoFinal(elemento);
		}else if(posicao > 1 && posicao < tamanho+1) {
			
			Elemento elem = primeiro;
			
			for(int i=1; i<posicao; i++) {
				elem = elem.getProximo();
			}
			
			elemento.setProximo(elem.getProximo());
			
			elem.setProximo(elemento);
			
			tamanho++;
		}else {
			System.out.println("Posição inválida!");
		}
		
	}
	
	public void removerDoInicio() {
		
		if(tamanho == 0) {
			System.out.println("Lista vazia!");
		}else {
			
			primeiro = primeiro.getProximo();
			tamanho--;
			
		}
		
	}
	
	public void removerDoFinal() {
		
		if(tamanho == 0) {
			System.out.println("Lista vazia!");
		}else {
			
			Elemento elem = primeiro;
			
			//paro no penultimo elemento
			for(int i = 0; i<tamanho-2; i++) {
				elem = elem.getProximo();
			}
			
			elem.setProximo(null);
			
		}
		
	}
	
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void imprimirElementos() {
		System.out.println("Imprimindo lista...");
		Elemento elem = primeiro;
		
		//percorre a lista até o último elemento
		while ( elem.getProximo() != null) {
			elem.imprimirDados();
			elem = elem.getProximo();
		}
		
		elem.imprimirDados();
	}
	
	
}
