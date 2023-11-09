// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class q01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n;
		
		System.out.println("Digite um número:");
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("É negativo.");
		}
		else {
			System.out.println("Não é negativo.");
		}
		
		sc.close();
	}
}
