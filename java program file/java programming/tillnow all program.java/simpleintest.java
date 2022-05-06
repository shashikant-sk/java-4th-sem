import java.io.*;
class simpleintrest
{
	int i,p,t,r;
	
	void display()
	{
		p=1000;
	r=20;
	t=4;
	i=p*t*r/100;
	System.out.println("simple intrest is "+i);
	}
	}
	class shashikant
	{
		public static void main(String args[])
		{
		simpleintrest si=new simpleintrest();
			si.display();
			System.out.println("program completed");
		}
	}