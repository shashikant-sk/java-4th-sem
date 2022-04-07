import java.io.*;

   class prog2{    
      public static void main(String args[]){   
  
      try {    
  
        System.out.println("Inside the try block");  
          
        
       int data=25/0;    
       System.out.println(data);    
      }    
     
      catch(NullPointerException e){  
        System.out.println(e);  
      }   
       catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException o)
        {
            System.out.println(o);
        }
        catch(NegativeArraySizeException m)
        {
            System.out.println(m);
        }
        
      finally {  
        System.out.println("finally block is always executed");  
      }    
  
     
      }    
    }