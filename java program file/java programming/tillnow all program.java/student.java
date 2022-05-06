import caller.mypackage;
  public class student
   {
     public static void main (String args [ ])
{
    	mypackage c=new mypackage();
    	float s=c.volume(5,10,20);
      	System.out.println("volume is"+s);
     	int z=c.sqr(5);
     	System.out.println("square volume is"+ z);
}
}