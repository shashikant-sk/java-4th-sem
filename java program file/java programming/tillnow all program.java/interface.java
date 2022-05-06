interface perimeter
{
	void disp();
	
}
class circle implements perimeter
{
public void disp()
	
	{
		float p,r=1;
		p=2*r*22/7;
		System.out.println("circle"+p);
		}
		}
class rectangle implements perimeter
{
public  void disp()
     {
     	int l,b,a;l=3;b=5;
     	a=l*b;
     	System.out.println("rect"+a);
     }	
}	
class smain
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.disp();
		rectangle u=new rectangle();
		u.disp();
	}
}