/*Create a class Bank with data members [Account_no,
Account_holder_name, balance_in_account] and it implements an interface
BankDetails which contains the following members functions-
(i) Creates() method to create account.
(ii) Deposit() method to deposit amount.
(iii) Withdraw() method to withdraw amount and also throws
LessBalanceException if an account holder tries to withdraw money
which makes the balance becomes less than available amount in
account.
(iv) Display() method to display the customer information with available
balance. ‘Account_holder_name’ should be converted in upper case
(all characters) while displaying.*/
import java.util.Scanner;

class lessBalanceException extends RuntimeException{
    lessBalanceException(String s){
        super(s);
    }
}

interface bank_details{
    void create();
    void deposit();
    void withdrawn();
    void display();

}

class bank implements bank_details{
    Scanner sc= new Scanner(System.in);
    int account_number;
    String account_holder_name;
    int balance_in_account;
    public void create(){
        System.out.println("Enter name: ");
        account_holder_name = sc.nextLine();
        System.out.println("Enter account number: ");
        account_number=sc.nextInt();
        System.out.println("Enter balance: ");
        balance_in_account=sc.nextInt();
    }
    public void deposit() {
        int n;
        System.out.println("Enter amount to be deposited: ");
        n=sc.nextInt();
        balance_in_account+=n;
        System.out.println("Updated balance is : "+balance_in_account);
        
    }
    public void display() {
        
        System.out.println("Details of customer: ");
        System.out.println("Account number: "+account_number);
        System.out.println("Name: "+account_holder_name.toUpperCase());
        System.out.println("Balance: "+balance_in_account);
        
    }
    public void withdrawn() {
        System.out.println("Enter amount to be withdrawn: ");
        int a=sc.nextInt();
        if(a>balance_in_account){
            throw new lessBalanceException("Not sufficient balance...");
        }
        else{
            balance_in_account-=a;
            System.out.println("New balance : "+balance_in_account);
        }
        
    }
    public static void main(String[] args) {
        bank b= new bank();
        b.create();
        b.deposit();
        b.display();
        b.withdrawn();
    }

}