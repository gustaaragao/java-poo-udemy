/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

import java.util.Scanner;

public class q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, qtdIn = 0, qtdOut = 0;
		
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int entrada = sc.nextInt();
			
			if (entrada >= 10 && entrada <= 20) {
				qtdIn++;
			}
			else {
				qtdOut++;
			}
		}
		
		System.out.printf("%d in%n", qtdIn);
		System.out.printf("%d out%n", qtdOut);
		
		sc.close();
	}
}
