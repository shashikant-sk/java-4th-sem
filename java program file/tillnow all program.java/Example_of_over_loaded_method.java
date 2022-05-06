class Example_of_over_loaded_method
{
void disp()
{
System.out.println("using overloadingmethod");
}
void disp(int x)
{
int s = 0;
s = x * x;
System.out.println ("square value is:"+s);
}
void disp(int x, int y)
{
if(x>y)
System.out.println ("the greatest no. is:"+x);
else
System.out.println ("the smallest no.is:"+y);
}
}
class smain
{
public static void main(String args[])
{
Example_of_over_loaded_method p=new Example_of_over_loaded_method();
p.disp ();
p.disp (5);
p.disp (10,5);
}
}