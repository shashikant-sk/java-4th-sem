import java.io.*;
class primepara
{
	void disp(int n)
{
	int m=0,i;
		for(i=n-1;i>1;i--)
		{
			m=n%i;
        	if(m==0)
			break;
				}
			if(m==0)
			System.out.println("not a prime No."+m);
			else
			System.out.println("it's a prime No."+m);
			}
			}
			class smain
			{
				public static void main(String args[])throws IOException
				{
				
				int x;
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter NO");
				x=Integer.parseInt(br.readLine());
				primepara p=new primepara();
				p.disp(x);
				}
				}
				
				