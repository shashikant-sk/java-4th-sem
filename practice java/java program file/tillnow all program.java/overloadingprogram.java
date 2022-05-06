class ppp
{
		void dips()
		{
		System.out.println("using overloading program");
	}
		void dips(int b)
		{
        int a=0;
		a=b*b;
		System.out.println("squre is:"+a);
		}
	void dips(int l,int m)
	{
	int k=l*m;
	System.out.println("multi"+k);
	}
	}
	class smain
	{
		public static void main(String args[])
		{
		ppp p=new ppp();
		p.dips();
		p.dips(5);
		p.dips(2,4);
		}
		}