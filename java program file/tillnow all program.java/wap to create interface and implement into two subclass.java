interface mm2
{
	public void main();
	}
	class ss implements mm
	{
	public void main()
	{
	int a,b,c;
	a=4;
	b=1;
	c=a-b;
	System.out.println("sub"+c);
	}
	}
   	class ww implements mm
		{
			public void main()
			{
				int a,b,c;
				a=2;
				b=4;
				c=a+b;
				System.out.println("add"+c);
				}
				}
				class smain
				{
					public static void main(String args[])
					{
						ss s=new ss();
						s.main();
						ww w=new ww();
						w.main();
						}
						}