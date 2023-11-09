package application;

import java.util.Scanner;

import enteties.Pessoa;

public class q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			vetor[i] = new Pessoa(nome, idade);
		}
		
		int idMaisVelho = 0;
		
		for (int i = 1; i<n; i++) {
			if (vetor[i].getIdade() > vetor[idMaisVelho].getIdade()) {
				idMaisVelho = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vetor[idMaisVelho].getNome());
		
		sc.close();
	}

}
