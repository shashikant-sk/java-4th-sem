class ss
{
	public void disp()
	{
		System.out.println("overridden");
		}
		}
		class ww extends ss
		{
			public void disp()
			{
			int s,n=7;
			s=n*n;
				System.out.println("square"+s);
				super.disp();
				}
				}
				class smain
				{
					public static void main(String args[])
					{
						ww w=new ww();
						w.disp();
						}
						}