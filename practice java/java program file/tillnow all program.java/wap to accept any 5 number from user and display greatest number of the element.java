import java.io.*;
class arraygreatest
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputSteamReader(System.in));
		int a[]=new int[5];
		int i,greatest=0;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter your number");
			a[i]=Integer.parseInt(br.readLine());
			}
			for(i=o;i<5;i++)
			{
				if(greatest<a[i])
			{
			 greatest=a[i]
				}
				}
				System.out.println("The greatest of the array element"+greatest);
				}
}