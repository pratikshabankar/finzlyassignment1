package coadingtest1;
class BankAccount{
    private  String accountNumber;
    private double balance;
    private String ownername;

    public BankAccount(String accountNumber, double balance, String ownername) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownername = ownername;
    }
    public void deposit( double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposite"+amount);
        }
        else {
            System.out.println("invalid deposited amount");
        }

    }


    public void withdraw( double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println(" withdrawn" +amount);

        }
        else {
            System.out.println("invalid withdrawn amount");
        }

    }
    public double getBalance(){
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnername() {
        return ownername;
    }
}


public class EncapsulationAndAccessControl {
    public static void main (String[] args){
        BankAccount b = new BankAccount( "123456784987554654",  4575766, "p");

        b.deposit(687777);
        b.withdraw(3456);

        System.out.println("accountnumber "+ b.getAccountNumber());
        System.out.println("balance" + b.getBalance());
        System.out.println("ownername"+ b.getOwnername());
    }
}
