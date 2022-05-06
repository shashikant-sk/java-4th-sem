import java.io.*;
class display_largestNumber
{
	public static void main(String args[])throws IOException
	{
		int a,b,c,largest;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st No.");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter 2nd No.");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter 3rd No.");
		c=Integer.parseInt(br.readLine());
		if(a>b && b>c && a>c)
		{
			largest=a;
			}
			else if(b>a && b>c)
			{
				largest=b;
				}
				else
				{
					largest=c;
					}
					System.out.println("the Largest number is"+largest);
		}
	}