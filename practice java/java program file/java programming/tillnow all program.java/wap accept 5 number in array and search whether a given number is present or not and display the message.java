import java.io.*;
class presentORnot
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5];
		int i,s,k=0;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter your number");
			a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter your number to be searched");
			s=Integer.parseInt(br.readLine());
			for(i=1;i<5;i++)
			{
				if (a[i]==s)
				k=1;
			}
			if(k==1)
			System.out.println("the Required number"+s+"is present");
			else
			System.out.println("the required number"+s+"is not present");
			}
}