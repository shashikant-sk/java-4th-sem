package extra;

import java.util.Scanner;

public class Employee {
 
 int age;
 String name;
 float salary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the age :: ");
  age = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + age);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[3];
  
  for(int i=0; i<3; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("** Data Entered as below **");
  
  for(int i=0; i<3; i++) {
   
   e[i].display();
  }
 }
}