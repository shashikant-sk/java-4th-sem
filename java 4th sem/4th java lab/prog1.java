/**1. Write a program in java to input and display the details of n number of students having
roll, name and cgpa as data members. Also display the name of the student having lowest
cgpa. */
import java.util.Scanner;

public class prog1 {

    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        student obj[] = new student[n];
        for (int i = 0; i < n; i++)
            obj[i] = new student();
        System.out.println("\nInput students: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            obj[i].input();
        }
        student lowest = new student();
        System.out.println("\nDisplaying students: ");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": ");
            obj[i].output();
        }
        lowest.cgpa = 10;
        for (int i = 0; i < n; i++) {
            if (lowest.cgpa > obj[i].cgpa)
                lowest = obj[i];
        }
        System.out.println("\nDisplaying student with lowest cgpa: ");
        lowest.output();
    }
}

class student {
    Scanner sc = new Scanner(System.in);
    public String name;
    public int roll;
    public float cgpa;

    student() {
        name = "";
        roll = 0;
        cgpa = 0;
    }

    void input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        System.out.print("Enter cgpa: ");
        cgpa = sc.nextFloat();
    }

    void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("CGPA: " + cgpa);
    }
}


















// import java.util.Scanner;

// class Student {
//     int rollNo;
//     String name;
//     double cgpa;

//      public void getDetails(int rollNo, String name, double cgpa){
//         this.rollNo=rollNo;
//         this.name=name;
//         this.cgpa=cgpa;
//      }
// }
// public class prog1 {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter the no. of Students: ");
//       int n = Integer.parseInt(sc.nextLine());
       
//       Student[] S = new Student[n];
      
//       int temp_roll;
//       String temp_name;
//       double temp_cgpa;

//       for(int i=0;i<n;i++){
//          System.out.print("\nEnter Student's Roll No: ");
//          temp_roll = Integer.parseInt(sc.nextLine());
//          System.out.print("Enter Student's Name: ");
//          temp_name = sc.nextLine();
//          System.out.print("Enter Student's CGPA: ");
//          temp_cgpa = Double.parseDouble(sc.nextLine());
//          S[i] = new Student();
//          S[i].getDetails(temp_roll, temp_name, temp_cgpa);
//       }
//       sc.close();

//       String lowest = S[0].name;
//       for(int i=1;i<n;i++){
//          if(S[i-1].cgpa>S[i].cgpa)
//             lowest=S[i].name;
//       }
//       System.out.println("\n"+ lowest + " has got the lowest CGPA");
//    }
// }