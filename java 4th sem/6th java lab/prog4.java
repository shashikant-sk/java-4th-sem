import java.util.Scanner;

class LessBalanceException extends Exception {
    int num;

    LessBalanceException(int num) {
        this.num = num;
    }

    public String ErrorMessage() {
        return "Withdrawn Amount of Rs " + this.num + " is not valid.";
    }
}

class Account {
    public int balance;

    Account() {
        balance = 500;
    }

    public void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt + " successfully.");
    }

    public void withdraw(int amt) throws LessBalanceException {
        if (amt <= balance - 500) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " successfully.");
        } else
            throw new LessBalanceException(amt);
    }

    public void displayBalance(int num) {
        System.out.println("Balance of User" + num + " -> " + balance);
    }
}

class manageAccount {
    manageAccount() {
        Account obj1 = new Account();
        Account obj2 = new Account();
        try {
            System.out.println("Accounting for User 1");
            obj1.deposit(1000);
            obj1.withdraw(200);
        } catch (LessBalanceException e) {
            String str = e.ErrorMessage();
            System.out.println(str);
        }
        try {
            System.out.println("Accounting for User 2");
            obj2.deposit(200);
            obj2.withdraw(1000);
        } catch (LessBalanceException e) {
            String str = e.ErrorMessage();
            System.out.println(str);
        }
    }
}

public class prog4 {
    public static void main(String[] args) {
        manageAccount obj = new manageAccount();
    }
}