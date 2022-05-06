import java.io.*;
class sum 
{
	public static void main(String args[])throws IOException
	
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter your number");
		    a[i]=Integer.parseInt(br.readLine());
		    }
		    System.out.println("the array element are");
		    	for(i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
		}
	}