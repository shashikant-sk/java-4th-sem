class ss
{
	public void disp()
	{
		System.out.println("hello using overridden method");
		}
		}
		class pp extends ss
		{
			public void disp()
			{
				System.out.println("this is sub programming");
				super.disp();
				}
				}
				class smain
				{
					public static void main(String args[])
					{
						ss s=new ss();
						s.disp();
						}
						}