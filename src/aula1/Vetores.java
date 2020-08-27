package aula1;

public class Vetores {

	//vetor como variável global
	static int[] vetor = new int[10];
	static int qtdElementos = 0;
	
	
	public static void main(String[] args) {
		
		adicionarElemento2(1);
		adicionarElemento2(3);
		adicionarElemento2(5);
		
		imprimirVetor();
		
		adicionarElemento2(7);
		
		imprimirVetor();
		
		removerElemento(7);
		
		imprimirVetor();
		
		System.out.println(buscarElemento2(2));
		
		buscarElemento(1);
		
		System.out.println("O tamanho do vetor é: "+pegarTamanho());
		
	}
	
	static void adicionarElemento1(int elemento) {
		
		int i;
	
		//percorrer o vetor até encontrar uma casa vazia, se encontrar inserir o elemento
		for(i=0; i<10; i++) {
			
			if(vetor[i] == 0) {
				vetor[i] = elemento;
				break;
			}
			
		}
		
		if(i == 10) {
			System.out.println("O vetor está cheio!");
		}
		
	}
	
	static void adicionarElemento2(int elemento) {	
		
		if(qtdElementos < 10) {
			vetor[qtdElementos] = elemento;
			qtdElementos++;
		}else {
			System.out.println("Vetor está cheio!");
		}
		
	}
	
	static void removerElemento(int elemento) {
		
		//restrições
		if(qtdElementos == 0) {
			
			System.out.println("O vetor está vazio!");
		
		}else {	
			
			for(int i=0; i<qtdElementos; i++) {
				
				if(vetor[i] == elemento) { // achar o elemento a ser removido
					
					for(int j=i; j<qtdElementos; j++) { // reorganizar os elementos -> 
						vetor[j] = vetor[j+1];
					}
					
					qtdElementos--;
					
					
				}
				
			}
			
			
		}
		
	}
	
	static void buscarElemento(int elemento) {
		
		if(qtdElementos == 0) {
			
			System.out.println("O vetor está vazio!");
		
		}else {
			
			for(int i=0; i<qtdElementos; i++) {
				
				if(vetor[i] == elemento) {					
					System.out.println("Elemento "+ elemento+ " está no vetor na posição: "+i);
				}
			}
			
		}
		
	}
	
	static int buscarElemento2(int posicao) {
		
		if(qtdElementos == 0) {
			
			System.out.println("O vetor está vazio!");
			return -1;
		
		}else {
			
			return vetor[posicao];
			
		}
		
		
	}
	
	static int pegarTamanho() {
		
		return qtdElementos;
	}
	
	static void imprimirVetor() {
		
		for(int i=0; i<10; i++) {
			
			System.out.print(vetor[i]+"\t");
			
		}
		
		System.out.println("");
		
	}
	
}
