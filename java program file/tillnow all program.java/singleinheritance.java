+class ss
{
	void disp()
	{
		System.out.println("using inheritance");
	}
}
class mm extends ss
{
	void show()
	{
		System.out.println("sub class");
	}
}
class smain
{
	public static void main(String args[])
	{
		mm m=new mm();
		m.disp();
		m.show();
	}
}