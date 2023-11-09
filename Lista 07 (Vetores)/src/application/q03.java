package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Pessoa;


public class q03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i =  0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
		for (int i = 0; i<n; i++) {
			somaAltura += vetor[i].getAltura();
		}
		
		double alturaMedia = somaAltura/vetor.length;
		
		int contadorMenores16 = 0;
		
		for (int i = 0; i<n; i++) {
			if (vetor[i].getIdade() < 16) {
				contadorMenores16 += 1;
			}
		}
		
		double porcentagemMenores16 = (double) contadorMenores16/n * 100;
		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagemMenores16) + "%");
		
		for (int i = 0; i<n; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		sc.close();
	}

}
