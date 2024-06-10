
public class BankingTransactionSystem {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(500.00);
        CheckingAccount checkingAccount = new CheckingAccount(1000.00);
        
        Transaction transaction = new Transaction(5.00);
        transaction.performTransaction(savingsAccount, 200.00, true);
        transaction.performTransaction(checkingAccount, 150.00, false);
        
        System.out.println("Total number of accounts: " + Bank.getTotalAccounts());
	}

}
