import java.io.*;
class sum_and_display
{
	public static void main(String args[])throws IOException
	{
		int i,n,s=0;
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
{	
      System.out.println("Enter the number");
      n=Integer.parseInt(br.readLine());
      for(i=1;i<=n;i++)
       System.out.println(""+i);	 
      }
      	for(i=1;i<=n;i++)
      		s=s+i;
      	System.out.println("sum is"+s);
      }
      }
      
      
      