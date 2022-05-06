import java.io.*;
class min
{
	public static void main(String args[])throws IOException
	{
		int i,n,m=0,k;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("how many number you want to print");
	    k=Integer.parseInt(br.readLine());
	    for(i=1;i<=k;i++)
	    {
		System.out.println("Enter your number");
		n=Integer.parseInt(br.readLine());
		if(m>n)
		m=m;
		else
		m=n;
		}
		System.out.println("print the greater no"+m);
		}
		}
		