// Illustrate the concept of Dynamic method dispatch with suitable example in Java.

import java.util.*;
import java.io.*;

class ParentClass {
    void func1() {
        System.out.println("ParentClass func1");
    }

    void func2() {
        System.out.println("ParentClass func2");
    }
}

class ChildClass extends ParentClass {
    void func1() {
        System.out.println("ChildClass func1");
    }

    void m3() {
        System.out.println("ChildClass m3");
    }
}

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParentClass p = new ChildClass();
        p.func1();
        p.func2();
        // p.m3(); // The method m3() is undefined for the type ParentClass.
    }
}