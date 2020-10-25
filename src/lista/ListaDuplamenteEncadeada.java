package lista;

public class ListaDuplamenteEncadeada {

	private ElementoDE primeiro, ultimo;
	private int tamanho = 0;
	
	
	public void adicionaNoInicio(ElementoDE elemento) {
		if(tamanho != 0) {
			elemento.setProximo(primeiro);
			primeiro.setAnterior(elemento);
			primeiro = elemento;
			
		}else {
			primeiro = elemento;
			ultimo = elemento;
		}
		
		
		tamanho++;
	}
	
	public void adicionaNoFinal(ElementoDE elemento) {
		
		if(tamanho != 0) {
			
			ultimo.setProximo(elemento);
			elemento.setAnterior(ultimo);
			
			ultimo = elemento;
			
		}else {
			primeiro = elemento;
			ultimo = elemento;
		}
		
		tamanho++;
		
	}
	
	public void adicionaNaPosicao(ElementoDE elemento, int posicao) {
		
		if(posicao == 1) {
			adicionaNoInicio(elemento);
		}else if(posicao == tamanho+1) {
			adicionaNoFinal(elemento);
		}else if(posicao > 1 && posicao < tamanho+1) {
			
			ElementoDE elem = primeiro;
			
			for(int i=1; i<posicao; i++) {
				elem = elem.getProximo();
			}
			
			elemento.setProximo(elem.getProximo());
			
			elem.setProximo(elemento);
			
			elem.getProximo().setAnterior(elemento);
			elemento.setAnterior(elem);
			
			tamanho++;
		}else {
			System.out.println("Posição inválida!");
		}
		
	}
	
	public void imprimirElementos() {
		System.out.println("\nImprimindo lista...");
		ElementoDE elem = primeiro;
		
		//percorre a lista até o último elemento
		while ( elem.getProximo() != null) {
			elem.imprimirDados();
			elem = elem.getProximo();
		}
		
		elem.imprimirDados();
	}
	
	
}
