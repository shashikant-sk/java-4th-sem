// Write a menu driven program in Java to implement bank transactions - Deposit, Withdrawal, checkBalance. 
// A bank customer has the attributes - acountno, name,balance,branchcode. 
// Deposit will add the entered amount to balance and withdrawal will deduct the entered amount from balance and  checkBalance will display the balance. 
// If the entered amount is negative then throw NegativeAmountException and display a message to try again.

import java.util.*;
import java.io.*;

class NegativeAmountException extends Exception {
    int num;

    NegativeAmountException(int num) {
        this.num = num;
    }

    public String ErrorMessage() {
        return "Withdrawn Amount of Rs " + this.num + " is not valid.";
    }
}

class Account {
    public int balance;
    public int accno;
    public String name;
    public String branchCode;

    Account() {
        balance = 0;
    }

    public void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt + " successfully.");
    }

    public void withdraw(int amt) throws NegativeAmountException {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " successfully.");
        } else
            throw new NegativeAmountException(amt);
    }

    public void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

public class prog {
    public static void main(String[] args) {
        Account obj = new Account();
        try {
            obj.deposit(1000);
            obj.withdraw(2000);
            obj.checkBalance();
        } catch (NegativeAmountException e) {
            String str = e.ErrorMessage();
            System.out.println(str);
        }
    }
}
