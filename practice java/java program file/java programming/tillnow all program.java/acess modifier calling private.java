class mm
{
	public int a;
	private int b;
	void disp()
	{
		b=20;
		System.out.println(b);
		}
		}
		class samin 
		{
			public static void main(String args[])
			{
			mm m=new mm();
			m.a=10;
			System.out.println(m.a);
			m.disp();
			}
			}