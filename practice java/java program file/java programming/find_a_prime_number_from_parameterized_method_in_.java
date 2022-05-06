class prime
{
	public void disp(int n)
	{
		int i,m=0;
		for(i=n-1;i>1;i--)
		{
			m=n%i;
			if(m==0)
			break;
			}
			if(m==0)
			System.out.println("prime");
			else
			System.out.println("not prime");
			}
			}
			class smain
			{
				public static void main(String args[])
				{
					prime s=new prime();
				    	s.disp(29);
				}
			}