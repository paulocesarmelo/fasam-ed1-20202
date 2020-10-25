package lista;

public class TesteLDE {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		// 30	10	50	20	40
		
		ElementoDE e1 = new ElementoDE();
		e1.setValor(10);
		
		lista.adicionaNoInicio(e1);
		
		ElementoDE e2 = new ElementoDE();
		e2.setValor(20);
		
		lista.adicionaNoFinal(e2);
		
		ElementoDE e3 = new ElementoDE();
		e3.setValor(30);
		
		lista.adicionaNoInicio(e3);
		
		ElementoDE e4 = new ElementoDE();
		e4.setValor(40);
		
		lista.adicionaNoFinal(e4);
		
		ElementoDE e5 = new ElementoDE();
		e5.setValor(50);
		
		lista.adicionaNaPosicao(e5, 2);
		
		lista.imprimirElementos();
		
		
		
	}
	
}
