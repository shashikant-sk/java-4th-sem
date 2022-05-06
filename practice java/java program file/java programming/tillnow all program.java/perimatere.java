class perimeter
{
	void mais()
	{
		int p,r=2;
p=2*r*22/7;
		System.out.println("perimeter"+p);
	}
}
class java extends perimeter
{
	void disp()
	{
		int l,b,a;
		l=2;
		b=4;
		a=l*b;
		System.out.println("perimeter of rectangle"+a);
	}
}
class smain
{
	public static void main(String args[])
	{
		java j=new java();
		j.mais();
		j.disp();
	}
}