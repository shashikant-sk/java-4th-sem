class ss
{
	void disp()
	{
		System.out.println("using inheritance" );
	}
}
class mm extends ss
{
	void show()
	{
		int a,b,c;a=10;b=2;
		c=a+b;
		System.out.println("sum is"+c);
	}
}
class ww extends mm
{
	void sho()
	{
		System.out.println("using sub");
	}
}
class smain
{
	public static void main(String args[])
	{
		ww s=new ww();
		s.disp();
		s.show();
		s.sho();
	}
}