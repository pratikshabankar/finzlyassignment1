package abstactionInJavaHw;

 abstract class BankAccount {
     protected   String accountNumber;
     protected String accountHolderName;
     protected  double balance;



     public abstract String getAccountNumber();
    public  abstract  String getAccountHolderName();
    public  abstract double getBalance();
    public  abstract void deposit(double amount);
     public abstract void withdraw(double amount);

 }

 class SavingsAccount extends BankAccount{
     private  double interestRate;


     public SavingsAccount(String accountNumber,String accountHolderName,double balance,double interestRate) {

         this.accountHolderName=accountHolderName;
         this.accountNumber=accountNumber;
         this.balance=balance;
         this.interestRate = interestRate;
     }

     @Override
     public String getAccountHolderName() {
         return accountHolderName;
     }

     @Override
     public String getAccountNumber() {
         return accountNumber;
     }

     @Override
     public double getBalance()
     {
         return balance;
     }

     public double getInterestRate() {
         return interestRate;
     }

     @Override
     public void deposit(double amount) {
         balance+=amount;
     }

     @Override
     public void withdraw(double amount) {
         if (amount>0 && amount<=balance){
             balance-=amount;

         }
         else {
             System.out.println("insufficient balance");
         }
     }
 }
 class CheckingAccount extends BankAccount{
     private double overdraftLimit;

     public CheckingAccount( String accountNumber,String accountHolderName,double balance ,double overdraftLimit) {
         this.overdraftLimit = overdraftLimit;
         this.accountNumber=accountNumber;
         this.accountHolderName =accountHolderName;
         this.balance=balance;
     }

     @Override
     public String getAccountNumber() {
         return accountNumber;
     }
     @Override
     public String getAccountHolderName() {
         return accountHolderName;
     }

     @Override
     public double getBalance() {
         return balance;
     }

     @Override
     public void deposit(double amount) {
         balance+=amount;
     }

     @Override
     public void withdraw(double amount) {
         if (balance+overdraftLimit >=amount){
             balance=balance-amount;
            if (amount>balance &&    amount<=overdraftLimit){
                 System.out.println(" You need to pay intrest");
             }
            else{
                System.out.println("u have suficient balance");
            }

         }
         else {
             System.out.println("exceeds the overdraft limit");
         }
     }
     public static void main(String[] args){
         SavingsAccount s= new SavingsAccount("123", "pratiksha",4000,2);
         CheckingAccount c=new CheckingAccount("245355","suraj",2000,10000);
         s.deposit(5000);
         s.withdraw(900);
         System.out.println("current balance "+s.getBalance());
         c.deposit(5000);
         c.withdraw(1200);
         System.out.println(" checking account balance  "+c.getBalance());
     }
 }

