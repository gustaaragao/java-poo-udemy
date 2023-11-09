package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Rectangle;

public class Q01 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", retangulo.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", retangulo.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", retangulo.diagonal()));
		
		sc.close();
	}
}
