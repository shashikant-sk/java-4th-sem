class ss
{
	void disp()
	{
		
		System.out.println("overridden");
		
	}
}
class mm extends ss
{
	void disp()
	{
		int a,b,c;a=2;b=9;
		c=a-b;
		super.disp();
		System.out.println("sub"+c);
	}
}
class smain
{
	public static void main(String args[])
	{
		mm s=new mm();
		s.disp();
	}
}
