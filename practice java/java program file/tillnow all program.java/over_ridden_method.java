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
		int a,b,c;a=1;b=8;
		c=a+b;
		super.disp();
		System.out.println("sum"+c);
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
