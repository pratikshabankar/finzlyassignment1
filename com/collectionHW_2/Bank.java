package com.collectionHW_2;
import java.util.*;
public class Bank {
    Bank(){

    }
    private int accNo;
    private String accHolderName;
    private double balance;

    public Bank(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit( double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance= balance-amount;
        }
        else{
            System.out.println(" Paisa khatam");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accNo='" + accNo + '\'' +
                ", accHolderName='" + accHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
