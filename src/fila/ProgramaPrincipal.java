package fila;

import java.util.Scanner;

public class ProgramaPrincipal {

	static FilaDinamica filaAtendimento;
	static Scanner input = new Scanner(System.in);
	static int senha = 0;
	
	public static void main(String[] args) {
		
		filaAtendimento = new FilaDinamica();
		
		
		int opcao;
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- Gerar Senha");
			System.out.println("2- Chamar");
			System.out.println("3- Verificar fila");
			System.out.println("4- Encerrar");
			opcao = input.nextInt();
			
			switch(opcao) {
			
			case 1:
				gerarSenha();
				break;
			case 2:
				chamar();
				break;
			case 3:
				verificarFila();
				break;
			case 4:
				System.out.println("Encerrando aplicação...\n");
				break;
			default:
				System.out.println("Opção inválida!");
			
			}
		
		}while(opcao != 4);
		
	}
	
	public static void gerarSenha() {
		
		Cliente cliente = new Cliente();
		System.out.println("Informe o nome e o numero da conta do cliente para gerar a senha:\n");
		cliente.setNome(input.next());
		cliente.setNumConta(input.nextInt());
		
		cliente.setSenha(++senha);
		
		System.out.println("Senha gerada: "+cliente.getSenha()+"\n");
		
		filaAtendimento.enfileirar(cliente);
		System.out.println();
		
	}
	
	public static void chamar() {
		
		Cliente cliente = (Cliente) filaAtendimento.desenfileirar();
		
		System.out.println();
		System.out.println("Cliente "+cliente.getNome());
		System.out.println("Senha: "+ cliente.getSenha());
		System.out.println("Favor se dirigir ao atendimento!");
		System.out.println();
		
	}
	
	public static void verificarFila() {
		System.out.println();
		filaAtendimento.imprimirCliente();
		System.out.println();
		
	}
	
	
}
