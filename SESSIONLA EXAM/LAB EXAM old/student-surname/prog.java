// Write a program to input a student’s full name from keyboard and store to a file. 
// Store the modified name to a new file where the surname is stored first and the other parts follow the surname.
// (e.g  Alok Kumar Das will be stored as Das Alok Kumar)

import java.util.*;
import java.io.*;

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String name = sc.nextLine();
        String first = "", last = "";
        int len = name.length();
        for (int i = 0; i < len; i++) {
            if (name.charAt(i) == ' ') {
                first += last + " ";
                last = "";
            } else {
                last += name.charAt(i);
            }
        }
        last += " ";
        try {
            FileWriter fw = new FileWriter("./prog.txt");
            fw.write(last);
            fw.write(first);
            fw.flush();
            fw.close();
            System.out.println("Contents written to file.");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
