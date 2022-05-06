import java.io.*;
class simpleinterestmethod
{
	int i,t,r,p;
	void display()
	{
		p=100000;
		r=36;
		t=3;
		i=p*t*r/100;
		System.out.println("simpleinterest"+i);
		}
		}
		class simpleinterest
		{
			public static void main(String args[])
			{
				simpleinterestmethod si=new simpleinterestmethod();
				si.display();
			}
		}