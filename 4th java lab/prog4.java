import java.util.Scanner;

public class prog4 {
    public static void main(String args[]) {
        Person[] obj = new Person[3];
        for (int i = 0; i < 3; i++)
            obj[i] = new Person();
        System.out.println("\nInput person: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            obj[i].input();
        }
        System.out.println("\nDisplaying person: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ": ");
            obj[i].disp();
        }
    }
}

class Account {
    Scanner sc = new Scanner(System.in);
    int accno;
    float balance;

    Account() {
        accno = 0;
        balance = 0;
    }

    void disp() {
        System.out.println("Account Number: " + accno);
        System.out.println("Balance = " + balance);
    }
}

class Person extends Account {
    String name;
    int adhaarno;

    Person() {
        name = "";
        adhaarno = 0;
    }

    void input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter account number: ");
        accno = sc.nextInt();
        System.out.print("Enter adhaar number: ");
        adhaarno = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextFloat();
    }

    void disp() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Balance = " + balance);
        System.out.println("Aadhar Number = " + adhaarno);
    }
}