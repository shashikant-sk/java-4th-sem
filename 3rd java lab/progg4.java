
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