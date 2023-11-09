package application;

import java.util.Scanner;

public class q04 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		
		System.out.println("NUMEROS PARES:");
		int qtdPares = 0;
		for (int i = 0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			
				qtdPares++;
			}
		}
		
		System.out.println();
		System.out.printf("QUANTIDADE PARES = %d", qtdPares);
		
		sc.close();
	}
	
}
