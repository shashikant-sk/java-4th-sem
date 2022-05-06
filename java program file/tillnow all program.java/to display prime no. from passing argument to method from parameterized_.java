class student
{
public void disp(int n)
{
int I;
if (n==1||n==2||n==3)
System.out.println("prime");
for(I=3;I<n-1;I++)
if(n%I==0)
{
System.out.println("not prime"+n);
break;
}
else
{
System.out.println("prime"+n);
break;
}
class smain
{
public static void main(String args[ ])
{
student s =new student( );
s.disp(5);
}
}