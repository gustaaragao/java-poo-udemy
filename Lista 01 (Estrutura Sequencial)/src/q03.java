/*
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class q03 {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A*B - C*D;
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();
	}
	
}