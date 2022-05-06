class student
{
static int a=10;
int j;
student()
{
j=20;
}
}
class main
{
public static void main (String args[ ])
{
System.out.println ("the value of A is:"+student.a);
student s =new student ( );
System.out.println("the value is:"+s.j);
}
}