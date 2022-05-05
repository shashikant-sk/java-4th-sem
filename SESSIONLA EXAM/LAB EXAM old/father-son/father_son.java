// Write a program to create a class “father” that stores the name and age of father. 
//Derive a class ”son” from “father” that stores the name and age of the child.
// Using necessary methods,input the values with the following constraints. 
// i) The name of both father and son must not be Same
// ii) The age of father must be at least 30 years greater than the son.

// If not followed then manage with proper user defined Exceptions

import java.util.*;
import java.io.*;

class NameEqualException extends Exception {
    public String error() {
        return "Name of father and son cannot be same.";
    }
}

class AgeException extends Exception {
    public String error() {
        return "Age of father must be at least 30 years greater than the son.";
    }
}

class father {
    public String name;
    public int age;

    public father() {
        name = "";
        age = 0;
    }
}

class son extends father {
    Scanner sc = new Scanner(System.in);
    public String name;
    public int age;

    public son() {
        name = "";
        age = 0;
    }

    public void fatherInput() {
        System.out.print("Enter name of Father: ");
        super.name = sc.nextLine();
        System.out.print("Enter age of Father: ");
        super.age = sc.nextInt();
        sc.nextLine();
    }

    public void sonInput() {
        System.out.print("Enter name of Son: ");
        this.name = sc.nextLine();
        System.out.print("Enter age of Son: ");
        this.age = sc.nextInt();
        sc.nextLine();
    }

    public void checkName() throws NameEqualException {
        if (this.name.equals(super.name)) {
            throw new NameEqualException();
        } else {
            System.out.println("Name verified.");
        }
    }

    public void checkAge() throws AgeException {
        if (super.age - this.age < 30) {
            throw new AgeException();
        } else {
            System.out.println("Age verified.");
        }
    }
}

public class father_son {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            son obj = new son();
            obj.fatherInput();
            obj.sonInput();
            obj.checkName();
            obj.checkAge();
        } catch (NameEqualException e) {
            System.out.println(e.error());
        } catch (AgeException e) {
            System.out.println(e.error());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
