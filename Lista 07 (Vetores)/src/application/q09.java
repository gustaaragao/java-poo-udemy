package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Aluno;

public class q09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] vetor = new Aluno[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			vetor[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i<n; i++) {
			if (vetor[i].media() >= 6.0) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		sc.close();

	}

}
