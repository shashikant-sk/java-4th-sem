// Exp 2. Write a program in Java to take first name and last name from user and print both in one line
// as last name followed by first name.

import java.util.Scanner;

public class b {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.println("-------------------------------------------");
    System.out.print("Input your first name: ");
    String fname = input.next();
    System.out.print("Input your last name: ");
    String lname = input.next();
    System.out.print("-----------------------------------------------\n");
    System.out.println(" "+fname+" "+lname);
    System.out.print("-----------------------------------------------\n \n");
  }
}