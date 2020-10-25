package pilha;

public class TestePilhaEstatica {

	public static void main(String[] args) {
		
		PilhaEstatica pilha = new PilhaEstatica(10);
		
		pilha.empilhar(5);
		
		pilha.imprimirElementos();
		
		pilha.empilhar(6);
		
		pilha.imprimirElementos();
		
		int elementoRemovido= pilha.desempilhar();
		
		System.out.println("Elemento removido: "+elementoRemovido);
		
		pilha.imprimirElementos();
		
		pilha.empilhar(10);
		
		int elementoTopo = pilha.topo();
		
		System.out.println("Elemento do topo: "+elementoTopo);
		
		pilha.imprimirElementos();
		
		
	}
	
}
