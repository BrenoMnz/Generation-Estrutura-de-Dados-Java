package DataStructuresJava;


import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		int opCode;
		String nome;
		
		do {
			
			System.out.println("Operações");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair\n");
			System.out.print("Insira a operação: ");
			opCode = ler.nextInt();
			
			ler.nextLine();
			
			switch(opCode) {
			case 1:
				System.out.print("\nInsira o nome do livro: ");
				nome = ler.nextLine();
				pilhaLivros.add(nome);
				System.out.println("\nAdicionado!\n");
				break;
			case 2:
				System.out.println("\nLivros da pilha\n");
				System.out.println(pilhaLivros + "\n");
				break;
			case 3:
				if(pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!\n");
				} else {
					System.out.println("\nO livro " + pilhaLivros.pop() + " foi retirado!\n");
				}
				break;
			}
			
		} while(opCode != 0);
		
		ler.close();
		
		System.out.println("\nPrograma finalizado!");

	}

}
