package fila;

public class TesteFilaEstatica {

	public static void main(String[] args) {
		
		FilaEstatica fila = new FilaEstatica(7);
		
		fila.enfileirar(123);
		fila.enfileirar(14);
		fila.enfileirar(777);
		fila.enfileirar(27);
		fila.enfileirar(90);
		fila.enfileirar(17);
		fila.enfileirar(9090);
		fila.enfileirar(7);
		
		fila.imprimirFila();
		
		fila.desenfileirar();
		
		fila.imprimirFila();
		
		System.out.println("Proximo: "+fila.primeiro());
		
	}
	
}
