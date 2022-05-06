class sup
{
int a;
a=10;
public void disp()
{
System.out.println("the value is"+ c); 
}
} 
class sub extends sup
{
int a;
public void disp()
{
this.a=a;
System.out.println ("the value is"+ a);
super.disp ();
}
}
class smain
{
public static void main (String args [])
{
sub s = new sub (5);
s.disp ( ); 
}
}