public class BankAccount{
         private String accnum;
        private  String accholname;
          private double bal;
         
         BankAccount(String accountNumber, String accountHolderName, double balance){
             accnum = accountNumber;
             accholname = accountHolderName;
             bal = balance;
         }
         
         public void deposit(double amount){
             bal= bal + amount;
             System.out.println("Deposited: " + amount);
             System.out.println("New Account Balance : " +bal);
         }
         
        public void withdraw(double amount){
             if (amount<=bal){
                 bal = bal - amount;
                 System.out.println("Withdrawn: " + amount);
                 System.out.println("New Account Balance : " +bal);
             }
             else{
                 System.out.println("Error. Insufficent funds");
             }
         }
         
         public double getBalance(){
             return bal;
         }
         
        public void displayAccountDetails(){
             System.out.println("Account Holder: " + accholname);
              System.out.println("Account Number: " + accnum);
               System.out.println("Balance: " + bal);
         }
         
}

class CheckingAccount extends BankAccount {
    private double overdraftlim;
   
    
    public CheckingAccount(String accnum, String accholname, double bal, double overdraftLimit) {
        super(accnum, accholname, bal);
        overdraftlim = overdraftLimit;
    }
    
    public void withdraw(double amount) {
        if ( amount <= (getBalance() + overdraftlim)) {
            
          withdraw(amount);
          
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getBalance());
           
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
    
    
}

class SavingsAccount extends BankAccount {
    private double intrate;
    
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        intrate = interestRate;
    }
     
    public void applyInterest() {
        double interest = getBalance() * (intrate / 100);
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
}
