package DataStructuresJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaDoBanco {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Queue<String> filaClientes = new LinkedList<String>();
		
		int opCode;
		String nome;
		
		do {
			
			System.out.println("Operações");
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("2 - Listar clientes na fila");
			System.out.println("3 - Chamar pessoa na fila");
			System.out.println("0 - Sair\n");
			System.out.print("Insira a operação: ");
			opCode = ler.nextInt();
			
			ler.nextLine();
			
			switch(opCode) {
			case 1:
				System.out.print("\nInsira o nome do cliente: ");
				nome = ler.nextLine();
				filaClientes.add(nome);
				System.out.println("\nAdicionado!\n");
				break;
			case 2:
				System.out.println("\nClientes na fila\n");
				System.out.println(filaClientes + "\n");
				break;
			case 3:
				if(filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!\n");
				} else {
					System.out.println("\nO cliente " + filaClientes.poll() + " foi atendido!\n");
				}
				break;
			}
			
		} while(opCode != 0);
		
		ler.close();
		
		System.out.println("\nPrograma finalizado!");

	}

}
