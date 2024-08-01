package practice;

public class BankAccount {
	private double balance;
	//to check balance
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	//to deposit
	public void deposit(double amount) {
		balance += amount;
	}
	//to withdraw
	public void withdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	}




	
	


