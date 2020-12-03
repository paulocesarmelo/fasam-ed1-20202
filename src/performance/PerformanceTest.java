package performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

/*
 * Script
 * 
 * 1- criar os tres objetos (vetor, lista encadeada, estrutura que simula um vetor)
 * 2- Preencher a estruturas com números aleatórios (usando Random)
 * 3- Realizar os testes para estruturas contendo 100 e 10000 elementos
 * 4- Medir as operações de inserção e busca
 * 
 */

public class PerformanceTest {

	public static void main(String[] args) {
		
		int tam = 1000000;
		
		int[] vetor = new int[tam];
		LinkedList<Integer> lista = new LinkedList<Integer>();
		Vector<Integer> vector = new Vector();
		
		Random rand = new Random();
		
		long tempoInicial = System.currentTimeMillis();
		for(int i=0 ; i<tam; i++) {
			lista.add(rand.nextInt());
		}
		
		long tempoFinal = System.currentTimeMillis();
		long tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo (add) lista: "+tempoTotal+"ms");
		
		 tempoInicial = System.currentTimeMillis();
		
		for(int i=0 ; i<tam; i++) {
			vetor[i] = rand.nextInt();
		}
		
		 tempoFinal = System.currentTimeMillis();
		 tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo (add) vetor: "+tempoTotal+"ms");
		
		tempoInicial = System.currentTimeMillis();
		for(int i=0 ; i<tam; i++) {
			vector.add(rand.nextInt());
		}
		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo (add) vector: "+tempoTotal+"ms");
		
		//Buscar elemento
		System.out.println("\nTempo de busca:\n");
		
		int elemento1 = vetor[9999];
		int elemento2 = lista.get(9999);
		int elemento3 = vector.get(9999);
		
		tempoInicial = System.currentTimeMillis();
		for(int i=0 ; i<tam; i++) {
			if(vetor[i] == elemento1) {
				break;
			}
		}
		
		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo (busca) vetor: "+tempoTotal+"ms");
		
		
		tempoInicial = System.currentTimeMillis();
		
		lista.contains(elemento2);
		
		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo (busca) lista: "+tempoTotal+"ms");
		
		
		tempoInicial = System.currentTimeMillis();
		
		vector.contains(elemento2);
		
		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println("Tempo (busca) vector: "+tempoTotal+"ms");
		
		
		
	}
	
	
}


