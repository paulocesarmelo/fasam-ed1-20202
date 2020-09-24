package lista;

import java.util.Scanner;

public class PrincipalLista {

	public static void main(String[] args) {
		
		ListaEncadeadaEstatica lista = new ListaEncadeadaEstatica(10);
		
		lista.adicionaNoInicio(3);
		
		lista.imprimirLista();
		
		lista.adicionaNoInicio(5);
		
		lista.imprimirLista();
		
		lista.adicionaNoInicio(10);
		
		lista.imprimirLista();
		
		lista.adicionaNoFinal(4);
		
		lista.imprimirLista();
		
		lista.adicionaNaPosicao(7, 1);
		
		lista.imprimirLista();
		
		lista.removerDoInicio();
		
		lista.imprimirLista();
		
		lista.removerDoFinal();
		
		lista.imprimirLista();
		
		lista.removerDaPosicao(1);
		
		//System.out.println("\n\nLista após remoção\n\n");
		
		lista.imprimirLista();
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um elemento para busca: ");
		int elemento = input.nextInt();
		
		lista.busca(elemento);
		
		
	}
	
	
}

