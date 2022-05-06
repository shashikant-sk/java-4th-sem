class ss 
{
	public static void main(String agrs[])
	{
		int n=5,m=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			m++;
			}
			if(m==2)
			System.out.println("not prime number");
			else
			System.out.println("prime number");
		}
	}