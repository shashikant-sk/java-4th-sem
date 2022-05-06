import java.io.*;
class rightangleTringle_star_
{
	public static void main(String args[])throws IOException
	{
		int i,j,k;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Row");
		k=Integer.parseInt(br.readLine());
		for(i=1;i<=k;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
				}
				System.out.println();
		}
		
	}
}