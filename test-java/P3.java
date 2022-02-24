import java.util.*;

class Shape{
    public float area;
    public void showArea(){

    }
}

class Circle extends Shape{
    public Scanner s=new Scanner(System.in);
    float r;
    public void showArea(){
        r=s.nextFloat();
        System.out.println("the area of circle is :"+3.14*Math.pow(r,2));
    }
}

class Rectangle extends Shape{
    public Scanner s=new Scanner(System.in);
    float l,b;
    public void showArea(){
        l=s.nextFloat();
        b=s.nextFloat();
        System.out.println("the area of rectangle is: "+l*b);
    }
}
public class P3 {
    public static void main(String asd[]){
        Circle c=new Circle();     
        Rectangle r=new Rectangle();
        c.showArea();
        r.showArea();
    }
}