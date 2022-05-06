import java.io.*;
class factorial_from_user
{
	public static void main(String args[])throws IOException
	{
		int a,b,c=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number");
		a=Integer.parseInt(br.readLine());
		for(b=1;b<=a;b++)
		{
			c=c*b;
		}
		System.out.println("your factorial is"+c);
	}
}