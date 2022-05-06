class ss
{
	public ss()
	{
		System.out.println("using constructor overloading");
		}
		public  ss(int x)
		{
			if(x%2==0)
			System.out.println("even"+x);
			else
			System.out.println("odd"+x);
			}
			int z;
			public ss(int x,int y)
			{
				z=x+y;
				System.out.println("sum"+z);
				}
				}
				class smain
				{
					public static void main(String args[])
					{
						ss q=new ss();
						ss r=new ss(5);
						ss t=new ss(5,10);
						}
						}