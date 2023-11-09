package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Student;

public class Q03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		estudante.name = sc.nextLine();
		
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE: %.2f%n", estudante.finalGrade());
		
		if (estudante.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", estudante.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
