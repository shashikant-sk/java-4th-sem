interface shashikant
{
	void disp();
	}
	class back
	{
		public void disp()
		{
			System.out.println("Using concept of multiple inheritance in interfaec");
		}
	}
	class butter extends back implements shashikant
	{
		public void show()
		{
			float p,r=2;
			p=2*r*22/7;
			System.out.println("circle:"+p);
			}
		}
		class smain
		{
			public static void main(String args[])
			{
				butter backs=new butter();
				backs.disp();
				backs.show();
			}
			
		}
	