package enteties;

public class BankAccount {
	
	private int number;
	private String name;
	private double balance;
	
	public BankAccount(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		depositValue(initialDeposit);
	}
	
	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
	}

	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	
	public void depositValue(double amount) {
		balance += amount;
	}
	
	public void withdrawValue(double amount) {
		balance -= (amount + 5);
	}
	
	public String toString() {
		return "Account " + number + " Holder: " + name + ", Balance: $ " + String.format("%.2f",balance);
	}
	
}
