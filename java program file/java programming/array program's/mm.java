//to get the minimum number of an array using a method;
import java.io.*;
class mm
{
	void minimum(int array[])
	{
		int minimum=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(minimum>array[i])
			minimum=array[i];
			}
			System.out.println(minimum);
			}
			}
			class smain
			{
			public static void main(String args[])throws IOException
			{
				int a[],n;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the number");	
			n=Integer.parseInt(br.readLine());
				mm m=new mm();
				m.minimum();	
			}
		}		