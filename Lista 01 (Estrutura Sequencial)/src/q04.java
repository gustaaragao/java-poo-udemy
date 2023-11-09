/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class q04 {
	
	public static void main(String[] agrs) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double dolaresPorHora, salario;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		dolaresPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * dolaresPorHora;
		
		System.out.printf("NUMBER = %d%n", numero);
		System.out.printf("SALARY = %.2f%n", salario);
		
		sc.close();
		
	}
	
}
