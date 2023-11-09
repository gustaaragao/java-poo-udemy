package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.next();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			int initialDeposit = sc.nextInt();
			conta = new BankAccount(number, name, initialDeposit);
		}
		else {
			conta = new BankAccount(number, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double deposit = sc.nextDouble();
		conta.depositValue(deposit);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		conta.withdrawValue(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
