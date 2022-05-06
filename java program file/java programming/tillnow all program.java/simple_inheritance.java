final class ss
{
	void disp()
	{
		System.out.println("using inhertance");
	}
}
class mm extends ss
{
	void show()
	{
		int z,s=5;
		z=s*s;
		System.out.println("square is"+z);
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