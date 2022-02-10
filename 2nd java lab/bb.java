// Accept 10 numbers from command line and check how many of them are even and how many odd.
  
import java.io.*; 
import java.util.Scanner; 
  
public class bb
{ 
    public static void main(String[] args) 
    { 
        
        Scanner sc=new Scanner(System.in);
        
        int n;    
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();    
        int arr[]=new int[n];   
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();   
        }
        
        System.out.println("The Even Elements are...");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)  
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" ");
        
        
        System.out.println("The Odd Elements are...");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)   
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
























// import java.util.*; 
// public class bb {
//  public static void main(String[] args)
//  {
//     int[] nums = {5, 7, 2, 4, 9};
// 	int ctr_even = 0, ctr_odd = 0;
// 	System.out.println("Original Array: "+Arrays.toString(nums)); 
	    
//     for(int i = 0; i < nums.length; i++) {
//         if(nums[i] % 2 == 0)
// 		{         
//           ctr_even++;
// 		}
// 		else
// 		   ctr_odd++;	
//     }                 
//     System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
// 	System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
// 	System.out.printf("\n");	
//   }
// }