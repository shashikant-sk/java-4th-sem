import java.io.*;
class Jpro
{
public static void main (String args [ ])throws IOException
{
int a, b, c;
BufferedReader br = new BufferedReader(newInputStreamReader (System.in));
{
System.out.println ("Enter your 1st no");
a = Integer.parseInt (br.readLine( ));
System.out.println ("Enter your 2nd no.");
b = Integer.parseInt (br.readLine( ));
System.out.println ("Enter your 3rd no.");
c = Integer.parseInt (br.readLine ( ));
if((a > b)&&(a > c))
System.out.println ("the greatest is" +a);
else if ((b >a)&&(b > c))
System.out.println ("the greatest is" +b);
else
System.out.println ("the greatest is"+c);
}
}