class ss
{
	void disp()
	{
System.out.println("using multiple inheritance");
}
 }
  class mm extends ss
  {
  	void show()
	{
	int a,b,c;
    	a=10;
		b=2;
		c=a+b;
	System.out.println("sum"+c);
	}
	}
	   class smain
	{
	public static void main(String args[])
	{
	  ss s=new ss();
		s.disp();
		mm m=new mm();
	    m.show();
	 }
 	}