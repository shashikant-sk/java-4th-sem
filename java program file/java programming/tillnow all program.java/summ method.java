class ss
{
	public ss()
	{
		System.out.println("using method");
	}
}
class mm
{
public mm(int x)
	{
		if(x%2==0)
		System.out.println("even"+x);
		else
		System.out.println("odd"+x);
	}
}
class ww
{
	int z;
	public ww(int x,int y)
	{
		z=x+y;
		System.out.println("sum"+z);
		}
		}
class smain
{
	public static void main(String args[])
	{
		ss s=new ss();
		mm m=new mm(5);
		ww w=new ww(5,10);
	}
	
}		