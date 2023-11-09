/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class q05 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, qtd1, qtd2;
		double valorUnidade1, valorUnidade2, total;
		
		// Lendo os dados da Peça 1
		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valorUnidade1 = sc.nextDouble();

		// Lendo os dados da Peça 2
		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valorUnidade2 = sc.nextDouble();
		
		// Calculando o valor total a ser pago
		total = qtd1*valorUnidade1 + qtd2 * valorUnidade2;
		
		System.out.printf("VALOR A PAGAR: %.2f", total);
	}
	
}
