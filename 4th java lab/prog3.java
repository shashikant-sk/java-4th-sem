public class prog3 {
    public static void main(String args[]) {
        Circle circleobj = new Circle(1.2f);
        circleobj.showArea();
        Rectangle rectobj = new Rectangle(4f, 3f);
        rectobj.showArea();
    }
}

class Shape {
    public float area;

    public void showArea() {
    };
}

class Circle extends Shape {
    public float area, r;

    Circle(float rad) {
        r = rad;
    }

    public void showArea() {
        area = 3.141f * r * r;
        System.out.println("Area of circle of radius " + r + " = " + area);
    };
}

class Rectangle extends Shape {
    public float area, l, b;

    Rectangle(float lenght, float breadth) {
        l = lenght;
        b = breadth;
    }

    public void showArea() {
        area = l * b;
        System.out.println("Area of circle of length " + l + " and breadth " + b + " = " + area);
    };
}