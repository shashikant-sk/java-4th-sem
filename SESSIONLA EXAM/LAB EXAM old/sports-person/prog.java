// Create Sport class as the base class contains constructor and favoriteSports() method. 
// Derive this class in Personl class and invoke super-class constructor. 
// Create another class Person2 and create object of subclass to invoke the methods of subclass and test it.

class Sport {
    Sport() {
        System.out.println("Sport class constructor");
    }

    void favoriteSports() {
        System.out.println("Favorite Sport is:");
    }

}

class Person1 extends Sport {
    Person1() {
        System.out.println("Person 1:");
    }

    void method1() {
        System.out.println("Method 1 Person 1 :");
    }
}

class Person2 {
    Person2() {
        System.out.println("Person 2:");
    }
}

class prog {
    public static void main(String args[]) {
        Person1 a = new Person1();
        a.method1();
        a.favoriteSports();

    }
}