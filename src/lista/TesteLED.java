package lista;

public class TesteLED {

	public static void main(String[] args) {
		
		ListaEncadeadaDinamica lista = new ListaEncadeadaDinamica();
		
		// 20	30	10	20	10
		
		Elemento e1 = new Elemento();
		e1.setValor(10);
		
		lista.adicionaNoInicio(e1);
		
		Elemento e2 = new Elemento();
		e2.setValor(20);
		
		lista.adicionaNoFinal(e2);
		
		Elemento e3 = new Elemento();
		e3.setValor(30);
		
		lista.adicionaNoInicio(e3);
		
		Elemento e4 = new Elemento();
		e4.setValor(40);
		
		lista.adicionaNoFinal(e4);
		
		Elemento e5 = new Elemento();
		e5.setValor(50);
		
		lista.adicionaNaPosicao(e5, 2);
		
		
		lista.imprimirElementos();
		
		
	}
	
}
