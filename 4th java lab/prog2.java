/**2. Illustrate the execution of constructors in multi-level inheritance with three Java classes –
plate(int length, int width), box(length, width, height), wood box (length, width, height,
thick). */
public class prog2 {
    public static void main(String args[]) {
        System.out.println("Inside main function.........");
        box1 obj = new box1();
    }
}

class plate {
    int length, width;

    plate() {
        System.out.println("Inside Constructor of great grandparent class");
    }
}

class plate1 extends plate {
    float length;
    int width;

    plate1() {
        System.out.println("Inside Constructor of grandparent class");
    }
}

class box extends plate1 {
    int length, width, height;

    box() {
        System.out.println("Inside Constructor of parent class");
    }
}

class box1 extends box {
    int length, width, height, thick;

    box1() {
        System.out.println("Inside Constructor of base class");
    }
}