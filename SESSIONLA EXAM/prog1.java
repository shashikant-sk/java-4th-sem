import java.io.*;
import java.util.Scanner;

public class prog1 {
    // Write a program to input a student’s full name from keyboard and store to a file.  Store the modified name to a new file where the surname is stored first and the other parts follow the surname.(e.g  Alok Kumar Das will be stored as Das Alok Kumar)
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter your full name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // storing name to file
        try (PrintStream out = new PrintStream(new FileOutputStream("name.txt"))) {
            out.print(name);
        }

        String[] nameArray = name.split(" ");

        // concatenate the last name with the remaining name
        String lastName = nameArray[nameArray.length - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nameArray.length - 1; i++) {
            sb.append(nameArray[i]);
            sb.append(" ");
        }

        String firstName = sb.toString();
        String newName = lastName + " " + firstName;
        System.out.println(newName);

        try (PrintStream out = new PrintStream(new FileOutputStream("reverseName.txt"))) {
            out.print(newName);
        }
    }
}