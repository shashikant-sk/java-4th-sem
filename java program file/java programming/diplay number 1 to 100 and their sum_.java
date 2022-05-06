import java.io.*;
class sum
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,s;
		s=0;
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter your Number");
			n=Integer.parseInt(br.readLine());
			s=s+i;
			}
			System.out.println("sum is"+s);
			}
             }