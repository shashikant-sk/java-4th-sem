class mm
{
	void ss()
	{
		System.out.println("using method");
	}
   void ss(int n)
     {
	int i,m;
	m=1;
	for(i=1;i<=n;i++)
	{
		m=m*i;
	}
	System.out.println(m);
	}
	void ss(int x,int y,int z)
	{
	if(x>y && x>z)
	System.out.println("x greatest");
	else if (y>x && y>z)
	System.out.println("y greatest");
	else 
	System.out.println("z greatest");
	}
	}

class smain
{
	public static void main(String args[])
	{
	mm m=new mm();
	m.ss();
	m.ss(5);
	m.ss(5,6,7);
		}
		}

