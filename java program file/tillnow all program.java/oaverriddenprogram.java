class oaverriddenprogram
{
	public void show()
	{
		System.out.println("hello using overridden:");
		}
}
class ss extends oaverriddenprogram
{
	public void show()
	{
		int a,b,c;
		b=65;
		c=5;
		a=b-c;
		System.out.println("sub is:"+a);
		super.show();
		}
		}
		class smain
		{
			public static void main(String args[])
			{
				ss s=new ss();
				s.show();
			}
		}