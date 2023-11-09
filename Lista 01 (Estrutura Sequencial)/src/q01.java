/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/

import java.util.Scanner;

public class q01 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x, y, soma;

		x = sc.next();
		y = sc.next();
		
		soma = x + y;
		
		System.out.printf("SOMA = %s", soma);
		
		sc.close();
	}
	
}
