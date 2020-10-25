package pilha;

import java.util.Stack;

public class TestePilhaDinamica {

	public static void main(String[] args) {
	
		PilhaDinamica pilha = new PilhaDinamica();
		
		pilha.empilhar(5);
		
		pilha.imprimirElementos();
		
		pilha.empilhar(6);
		
		pilha.imprimirElementos();
		
		Object elementoRemovido= pilha.desempilhar();
		
		System.out.println("Elemento removido: "+elementoRemovido.toString());
		
		pilha.imprimirElementos();
		
		pilha.empilhar(10);
		
		Object elementoTopo = pilha.topo();
		
		System.out.println("Elemento do topo: "+elementoTopo.toString());
		
		pilha.imprimirElementos();
		
		
	}
	
	
	
}
