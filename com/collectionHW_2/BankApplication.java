package com.collectionHW_2;

import java.util.ArrayList;
import java.util.TreeSet;

public class BankApplication {
    public static void main(String[] args) {
        ArrayList<Bank> accounts = new ArrayList<>();
        Bank bank1=new Bank(5421334,"suraj",466787665);
        Bank bank2 = new Bank(767465,"apeksha",887899);
        Bank bank3=new Bank(986726,"rucha",8990987);
        Bank bank4=new Bank(231456,"pratiksha",977622);

        accounts.add(bank1);
        accounts.add(bank2);
        accounts.add(bank3);
        accounts.add(bank4);

        bank4.deposit(100000);
        bank2.deposit(50000);
        bank1.withdraw(5000);

        System.out.println("List of accounts");

        for (Bank acc :accounts) {
            System.out.println(acc);

        }



    }
}
