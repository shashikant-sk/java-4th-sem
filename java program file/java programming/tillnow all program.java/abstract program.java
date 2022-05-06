abstract class ss
{
  abstract void disp();
	}
class mm extends ss
{
	void disp()
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
		
	}
}