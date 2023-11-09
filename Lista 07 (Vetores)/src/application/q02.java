package application;

import java.util.Locale;
import java.util.Scanner;

public class q02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i<n; i++) {
			soma += vetor[i];
		}
		
		double avg = soma / vetor.length;
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i<n; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", avg);
		
		
		sc.close();
		
	}
	
}
