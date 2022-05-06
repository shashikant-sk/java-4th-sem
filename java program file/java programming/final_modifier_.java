class Mukesh
{
public void disp (int a, int b)
{
int c = a + b;
System.out.println("sum is:" + c);
}
}
class Amit extends Mukesh
{
public void dips(int d, int e, int f)
{
int g=d*e*f;
System.out.println("multilply is:"+g);
}
}
class smin
{
public static void main (String args [])
{
Amit k =new Amit ( );
k.dips(2,4,6);
k.disp (4,5);
}
}