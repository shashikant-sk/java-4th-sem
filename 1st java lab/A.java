import java.util.Scanner;
public class A {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.println("---------------------------------------");
    System.out.print("YOUR NAME: ");
    String fname = input.next();
    System.out.print("");

    System.out.print("ROLL NO: ");
    String Roll = input.next();
    System.out.print("");

    System.out.print("SECTION: ");
    String sec = input.next();
    System.out.print("");

    System.out.print("Branch: ");
    String bra = input.next();
    System.out.print(""); 
       System.out.println("-----------------------------------");
    System.out.println(" "+fname+"\n "+Roll+" \n "+sec+"\n "+bra);

    
  }
}