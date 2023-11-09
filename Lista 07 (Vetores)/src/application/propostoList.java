package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enteties.Funcionario;

public class propostoList {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		
		// Registrando o funcionário:
		for (int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Esse Id já foi registrado. Tente novamente: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Sallary: ");
			double sallary = sc.nextDouble();
			
			list.add(new Funcionario(id, name, sallary));
		}
		
		// Atualizando o salário do funcionário:
		System.out.println();
		System.out.print("Digite o Id do funcionário que terá seu salário aumentado: ");
		int idSalarioAumentado = sc.nextInt();
		
		if (hasId(list, idSalarioAumentado)) {
			System.out.print("Digite a porcentagem: ");
			double percentage = sc.nextDouble();
			
			Funcionario func = list.stream().filter(x -> x.getId() == idSalarioAumentado).findFirst().orElse(null);
			func.increaseSallary(percentage);
		}
		else {
			System.out.println("O Id digitado não existe!");
		}
		
		// Imprimindo os funcionários na tela com o laço forEach
		System.out.println();
		System.out.println("Lista dos Funcionários:");
		for (Funcionario func : list) {
			System.out.println(func);
		}
		
		
		sc.close();
		
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
	
}
