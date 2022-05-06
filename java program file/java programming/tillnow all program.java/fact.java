import java.awt.*;
import java.applet.*;
public class fact extends Applet
{
int m, n, I;
public void init ()
{
m= 1;
n = 5;
for (I=1;I<=n;I++)
{
m = m * I;
}
}
public void paint (Graphics g)
{
g.drawString ("the fact is"+String.valueOf(m),
10, 50) ;
}
}