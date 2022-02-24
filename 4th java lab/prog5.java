public class prog5 {
    public static void main(String[] args) {
        childClass obj = new childClass();
    }
}

class baseClass {
    baseClass(int a) {
        System.out.println("Inside Base Class paramterised constructor with paramter = " + a);
    }
}

class childClass extends baseClass {
    childClass() {
        super(2);
        System.out.println("Used super to call base class in above line");
        System.out.println("Inside child class");
    }
}