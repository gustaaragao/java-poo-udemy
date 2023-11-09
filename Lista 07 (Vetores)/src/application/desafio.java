package application;

import java.util.Scanner;

import enteties.Aluguel;

public class desafio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		Aluguel[] vetor = new Aluguel[10];
	
		for (int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			
			Aluguel quarto = new Aluguel(name, email);
			
			vetor[roomNumber] = quarto;
		}
		
		System.out.println();
		System.out.println("Quartos alugados:");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		sc.close();
	}
	
}
