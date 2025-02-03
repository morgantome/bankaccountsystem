public class BankSystem {
    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount checking = new CheckingAccount("CHK123", "John Doe", 1000, 500);
        BankAccount savings = new SavingsAccount("SAV456", "Jane Smith", 2000, 3.5);
        
        BankAccount[] accounts = {checking, savings};
        
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            account.deposit(500);
            account.withdraw(1200);
          
        }
    }
}
