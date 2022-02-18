/*2. Write a program in Java to define a class Rectangle having data member: length and
breadth; to calculate the area and perimeter of the rectangle. Use member functions to
read, calculate and display. */
import java.util.Scanner;

public class progg2 {
    public static void main(String args[]) {
        Rectangle rc = new Rectangle();
        rc.readData();
        rc.calculate();
        rc.displayData();
    }
}

class Rectangle {
    Scanner sc = new Scanner(System.in);
    private float l, b, area, per;

    Rectangle() {
        l = b = area = per = 0;
    }

    void readData() {
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
    }

    void calculate() {
        area = l * b;
        per = 2 * (l + b);
    }

    void displayData() {
        System.out.println("Length = " + l);
        System.out.println("Breadth = " + b);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + per);
    }
}

//---------------------------------------------------------------------------//



// class progg2
// {
//     public static void main(String arg[])
//     {
//         Rectangle rect = new Rectangle(10, 5);
        
//         System.out.println("Length = " + rect.length);
//         System.out.println("Breadth = " + rect.breadth);
//         System.out.println("Area = " + rect.getArea());
//         System.out.println("Perimeter = " + rect.getPerimeter());
    
//     }
// }

// class Rectangle
// {
//     double length;
//     double breadth;

//     Rectangle(double length, double breadth)
//     {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     double getArea()
//     {
//         return length * breadth;
//     }

//     double getPerimeter()
//     {
//         return 2 * (length + breadth);
//     }
// }