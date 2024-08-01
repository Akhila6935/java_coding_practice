package practice;

public class BankAccountTest {
	public static void main(String[] args) {
	// for initial balance
    BankAccount account = new BankAccount(1000.0);

    // Display the initial balance
    System.out.println("Initial balance: " + account.getBalance());

    // Deposit money
    account.deposit(500.0);
    System.out.println("Balance after deposit of 500: " + account.getBalance());

    // Withdraw money
    account.withdraw(200.0);
    System.out.println("Balance after withdrawal of 200: " + account.getBalance());

    // display remaining balance
    account.withdraw(1500.0);
    System.out.println("Balance after attempted withdrawal of 1500: " + account.getBalance());
}
}

	


