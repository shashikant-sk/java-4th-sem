class student
{
public void disp()
{
System.out.println ("hello, using an over riddenmethod");
}
}
class ss extends student
{
public void disp()
{
System.out.println ("this is sub program");
super.disp();
}
}
class smain
{
public static void main (String args[])
{
ss s= new ss();
s.disp();
}
}