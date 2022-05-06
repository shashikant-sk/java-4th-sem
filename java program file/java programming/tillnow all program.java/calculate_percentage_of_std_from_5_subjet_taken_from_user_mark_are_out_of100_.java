import java.util.Scanner;

class Sum 
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        float sum=0;
        for (int i=1;i<=5;i++) 
        {
            System.out.print("Enter of subject" + i + " ");
            if (!sc.hasNextFloat()) 
            {
                System.out.println("Invalid number, Please try again.");
                i--;
                sc.next();
                continue;
            }
            float mark = sc.nextFloat();
            if (mark > 100 || mark < 0) {
                System.out.println("Invalid number, Please try again.");
                i--;
            } else {
                sum += mark;
            }
        }

        System.out.println("Total sum is: " + sum);
        System.out.println("Percentage of user is: " + (sum / 500) * 100);
    }
}