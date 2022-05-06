import java.io.*;
abstract class ss
{
abstract void disp(int a,int b);
	}
	class mm extends ss
	{
		void disp(int a,int b)
		{
			int c;
	        c=a+b;
			System.out.println("sum is "+c);	
		}
	}
	class smain
	{
		public static void main(String args[])throws IOException
{
	int x,y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no 1");
x=Integer.parseInt(br.readLine());
System.out.println("Enter no 2");
y=Integer.parseInt(br.readLine());
mm m=new mm();
m.disp(x,y);
}
}