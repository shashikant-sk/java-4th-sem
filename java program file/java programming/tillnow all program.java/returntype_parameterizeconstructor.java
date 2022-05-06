class ss
{
	int disp(int x)
	{
		if(x%2==0)
		return 0;
		else
		return 1;
		}
		}
		class smain
		{
			public static void main(String args[])
			{
			  ss smain=new ss();
				int z=smain.disp(7);
				if(z==0)
				System.out.println("even"+z);
				else
				System.out.println("odd"+z);
				}
				}
				