package fila;

public class TesteFilaDinamica {

	public static void main(String[] args) {
		
		FilaDinamica fila = new FilaDinamica();
		
		fila.enfileirar("Paulo");
		fila.enfileirar("Fulano");
		fila.enfileirar("Beltrano");
		
		fila.imprimir();
		
		fila.desenfileirar();
		
		fila.imprimir();
		
		System.out.println("Quem é o proximo? "+fila.primeiro() );
		
		
	}
	
}
