package application;

import java.util.Locale;
import java.util.Scanner;

public class q07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		int qtdPares = 0;
		
		for (int i = 0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				qtdPares++;
			}
		}
		
		if (qtdPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		else {
			double mediaPares = (double) somaPares/qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
		}
		
		
		sc.close();
	}

}
