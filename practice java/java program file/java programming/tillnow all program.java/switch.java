import java.io.*;
class shashikant_switch
{
public static void main (String args[])
{
int a;
BufferedReader br = new BufferedReader (new
InputStreamReader (System.in));
try
{
System.out.println("Enter Days Name Value Between 1 to 7");
a = Integer.parseInt(br.readLine());
switch (a)
{
case 1:
System.out.println("Sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wednesday");
break;
case 5:
System.out.println("Thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
break;
default:
System.out.println("Invalid No");
break;
}
}
catch (Exception e)
{
System.out.println("Error");
}
}
}