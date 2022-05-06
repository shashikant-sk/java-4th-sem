class primeno
{
	public static void main(String args[])
	{
		int i,m=0,n=5;
		for(i=n-1;i>1;i--)
	{
     	m=n%i;
     	if(m==0)
     	break;
   }
      if(m==0)
       System.out.println("not prime number");
      else
      System.out.println("prime number");
}
}