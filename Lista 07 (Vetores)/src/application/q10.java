package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Pessoa;

public class q10 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			
			vetor[i] = new Pessoa(altura, genero);
		}
		
		int idMaiorAltura = 0;
		int idMenorAltura = 0;
		
		for (int i = 1; i<n; i++) {
			if (vetor[i].getAltura() > vetor[idMaiorAltura].getAltura()) {
				idMaiorAltura = i;
			}
			else if (vetor[i].getAltura() < vetor[idMenorAltura].getAltura()) {
				idMenorAltura = i;
			}
		}
		
		int qtdMulheres = 0;
		double somaAlturaMulheres = 0.0;
		
		for (int i = 0; i<n; i++) {
			if (vetor[i].getGenero() == 'F') {
				somaAlturaMulheres += vetor[i].getAltura();
				qtdMulheres++;
			}
		}
		
		double mediaAlturaMulheres = (qtdMulheres == 0) ? 0.0 : somaAlturaMulheres/qtdMulheres;
		
		int qtdHomens = vetor.length - qtdMulheres;
		
		System.out.printf("Menor altura = %.2f%n", vetor[idMenorAltura].getAltura());
		System.out.printf("Maior altura = %.2f%n", vetor[idMaiorAltura].getAltura());
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + qtdHomens);
		
		sc.close();
		
	}
	
}
