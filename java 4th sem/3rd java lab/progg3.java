/**3. Write a program in Java to define a class Number with appropriate data members and
member functions to input n number of integers and swap the biggest and smallest
elements. Use member functions read(), swap() and display(). */

import java.util.Scanner;

public class progg3 {
    public static void main(String args[]) {
        Number num = new Number();
        num.readData();
        num.displayData();
    }
}

class Number {
    Scanner sc = new Scanner(System.in);
    private int n;
    private int[] arr;

    Number() {
        n = 0;
    }

    void readData() {
        System.out.print("Enter n: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    void swap() {
        int Lindex = 0, Lelement = 0, Sindex = 0, Selement = 10000;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Lelement) {
                Lelement = arr[i];
                Lindex = i;
            }
            if (arr[i] < Selement) {
                Selement = arr[i];
                Sindex = i;
            }
        }
        int t = arr[Sindex];
        arr[Sindex] = arr[Lindex];
        arr[Lindex] = t;
    }

    void displayData() {
        System.out.print("Array elements before swapping: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        swap();
        System.out.print("\nArray elements after swapping: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}