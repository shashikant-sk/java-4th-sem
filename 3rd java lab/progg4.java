// 4. Find the no. of occurrence of each element in an user entered array of numbers.

import java.util.*;  
import java.util.Arrays; 


public class progg4
{  
   public static void main(String args[])   
   {  
       Scanner sc=new Scanner(System.in);

      int n;    
      System.out.println("Enter the total number of elements ");
      n=sc.nextInt();    

      int arr[]=new int[n];   
      System.out.println("Enter the elements of the array ");
      for(int i=0; i<n ;i++)     
      {
          arr[i]=sc.nextInt();
      }
      
        
        System.out.println("Enter the element whose frequency you want to know");
        int ele=sc.nextInt();
        int occ=0;
        
        
        for(int i=0;i<n;i++)
        {
            if(ele==arr[i])
            {
                occ++;
            }
        }
        
        System.out.println(ele+" occurred "+occ+" times ");
        
       
   }
}




// import java.util.Scanner;

// public class prog4 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//             arr[i] = 0;
//         System.out.print("Enter the elements(0 to n-1): ");
//         for (int i = 0; i < n; i++) {
//             int k = sc.nextInt();
//             arr[k]++;
//         }
//         for (int i = 0; i < n; i++) {
//             if (arr[i]!=0) {
//                 System.out.println("Count of " + i + " = " + arr[i]);
//             }
//         }
//     }
// }