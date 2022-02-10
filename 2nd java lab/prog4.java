// 4. Write a class file – box with three data members (length, width, height) and a method volume() . Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.


import java.util.Scanner;

public class prog4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        box b = new box(l, w, h);
        int vol = b.volume();
        System.out.print("Volume = " + vol);
    }
}

class box {
    public int l, w, h;

    box(int a, int b, int c) {
        l = a;
        w = b;
        h = c;
    }

    public int volume() {
        return l * w * h;
    }
}