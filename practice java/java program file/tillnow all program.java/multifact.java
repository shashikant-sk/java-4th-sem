class multifact
{
int i,m=1;
void disp()
{
int n=5;
for(i=1;i<n;i++)
{
	m=m*i;
	}
	System.out.println("factorial is"+m);
	}
	}
class ss
{
	int x,y;
	void show()
	{
		x=10;
		y=x*x;
		System.out.println("Square is"+y);
	}
}	
class smain
{
	public static void main(String args[])
	{
		multifact f=new multifact();
		ss s=new ss();
		f.disp();
		s.show();
	}
}