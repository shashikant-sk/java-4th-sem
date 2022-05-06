class primes
{
	public static void main(String args[])
	{
		int i,j,m=0;
		for(i=9;i>1;i--)
		{
			for(j=2;j<=i-1;j++)
			{
				m=i%j;
				if(m==0)
				break;
				}
				if(m==0)
				{
			//	System.out.println("list of prime no"+j);
				}
				else 
				{
				System.out.println("list of prime no"+i);
				}
	}
}
}