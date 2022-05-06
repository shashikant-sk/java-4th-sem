import mypackage.Cal;
  public class student
   {
     public static void main (String args [ ])
{
    	Cal c=new Cal();
    	double s=c.volume(5,10,20);
      	System.out.println("volume is"+s);
     	int z=c.sqr(5);
     	System.out.println("square volume is"+ z);
}
}