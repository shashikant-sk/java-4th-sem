import java.util.*;
 class ss
 {
   public static void main(String args[])
   {
      int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
      System.out.println("Array = "+Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("Sorted Array = "+Arrays.toString(arr));
      System.out.println("Smallest element = "+arr[0]);
      System.out.println("2nd Smallest element = "+arr[0]);
      System.out.println("Largest element = "+arr[9]);
      System.out.println("2nd Largest element = "+arr[8]);
   }
}