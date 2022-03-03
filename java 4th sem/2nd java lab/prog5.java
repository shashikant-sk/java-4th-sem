// Write a program which will overload the area () method and display the area of a circle,
// triangle and square as per user choice and user entered dimensions.


public class prog5 {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        float a = 3, b = 4;
        double c = 5;
        ob.area(a);
        ob.area(a, b);
        ob.area(c);
    }
}

class OverloadDemo {
    public void area(float x) {
        float area = (float) 3.141 * x * x;
        System.out.println("Area of circle = " + area);
    }

    public void area(float x, float y) {
        float area = (float) 0.5 * x * y;
        System.out.println("Area of triangle = " + area);
    }

    public void area(double x) {
        double area = x * x;
        System.out.println("Area of square = " + area);
    }
}