class sup
{
int a;
public sup()
{
a = 10;
}
public void disp()
{
System.out.println ("the value is"+ a); 
}
}
class sub extends sup
{
int a;
public sub(int a)
{
this.a=a;
}
public void disp()
{
super.disp();
System.out.println ("the value is"+ a);
}
}
class smain
{
public static void main (String args [ ])
{
sub s=new sub(5); 
s.disp();
}
}
