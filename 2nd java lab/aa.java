// 1. Find the largest among 3 user entered nos. at the command prompt using Java.

import java.util.Scanner;
public class aa
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}





















// public class aa{

//     public static void main(String[] args) {
  
//         int num1 = 10, num2 = 20, num3 = 7;
  
//         if( num1 >= num2 && num1 >= num3)
//             System.out.println(num1+" is the largest Number");
  
//         else if (num2 >= num1 && num2 >= num3)
//             System.out.println(num2+" is the largest Number");
  
//         else
//             System.out.println(num3+" is the largest Number");
//     }
//   }




// import java.util.Scanner;

// public class aa {
//     public static void main(String[] args){
//         int x,y,z;
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the First number:= ");
//         x=sc.nextInt();
//         System.out.print("Enter the Second number:= ");
//         y=sc.nextInt();
//         System.out.print("Enter the Third number:= ");
//         z=sc.nextInt();
//         if (x>y && x>z){
//             System.out.println("The Largest Number is : "+x);
//         }
//         else if(y > z)
//         {
//             System.out.println("The Largest Number is : "+y);
//     }
//     else{
//         System.out.println("The Largest Number is : "+z);
//         }
//     }
// }
