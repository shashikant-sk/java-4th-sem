//Write a program to read the ith character to jth character from a file and verify whether it is palindrome or not. (i and j are user input values from keyboard).

import java.io.*;
import java.util.*;
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the file name :");
    
    String fileName = sc.nextLine();
    System.out.println("Enter the starting index :");
    
    int i = sc.nextInt();
    
    System.out.println("Enter the ending index :");
    
    int j = sc.nextInt();
    try {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        
        String s = br.readLine();
        System.out.println("The string is : "+s);
        String sub = s.substring(i,j);
        System.out.println("The substring is : "+sub);
        
        String rev = new StringBuffer(sub).reverse().toString();
        System.out.println("The reverse string is : "+rev);
        
        if(sub.equals(rev)) {
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palindrome");
        }
    }
    catch(Exception e) {
        System.out.println("Exception : "+e);
    }
}