/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar

CODIGO	|	ESPECIFICACAO	|	PRECO
1			Cachorro Quente		4.00
2			X-Salada			4.50
3			X-Bacon				5.00
4			Torrada Simples		2.00
5			Refrigerante		1.50
*/

import java.util.Scanner;

public class q05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double valor;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if (codigo == 1) {
			valor = qtd * 4.00;
		}
		else if (codigo == 2) {
			valor = qtd * 4.50;
		}
		else if (codigo == 3) {
			valor = qtd * 5.00;
		}
		else if (codigo == 4) {
			valor = qtd * 2.00;
		}
		else {
			valor = qtd * 1.50;
		}
		
		System.out.printf("Total: %.2f", valor);
		
		sc.close();
	}
}
