class eg_nested_try
{
	public static void main(String args[])
	{
		try 
		{
			int a=2,b=4,c=2,x=7,z;
			int p[]={2};
			p[3]=33;
			try
			{
				z=x/((b*b)-(4*a*c));
				System.out.println("the value of z is"+z);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Division by zero in arithmetic Expression");
					}
	}
      	catch(ArrayIndexoutofBoundException e)
	{
		System.out.println("ArrayIndexoutofBound");
		}
	}
	}