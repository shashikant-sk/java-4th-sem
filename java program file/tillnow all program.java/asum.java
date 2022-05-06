import java.awt.*;
import java.applet.*;
public class asum extends Applet
{int a, b, c;
public void init ()
{
a= 5;
b = 10;
c = a + b;
}
public void paint (Graphics g)
{
g.drawString ("the sum is"+String.valueOf(c),
10, 50);
}
}