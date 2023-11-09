/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. 
*/

import java.util.Locale;
import java.util.Scanner;

public class q06 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaCirc, areaTrape, areaQuad, areaRet;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTri = (A * C)/2;
		areaCirc = pi*Math.pow(C, 2);
		areaTrape = ((A + B)*C)/2;
		areaQuad = B*B;
		areaRet = A*B;
		
		System.out.printf("TRIANGULO : %.3f%n", areaTri);
		System.out.printf("CIRCULO : %.3f%n", areaCirc);
		System.out.printf("TRAPEZIO : %.3f%n", areaTrape);
		System.out.printf("QUADRADO : %.3f%n", areaQuad);
		System.out.printf("RETANGULO : %.3f%n", areaRet);
		
		sc.close();
	}
	
}
