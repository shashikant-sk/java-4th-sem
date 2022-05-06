import java.awt.*;
import java.applet.*;
public class checkbox extends Applet
{
Checkbox cb1, cb2;
Button b1;
public void init ( )
{
setBackground(Color.cyan);
setBackground(Color.red);
b1 = new Button ("java");
cb1 = new Checkbox ("bold");
cb2 = new Checkbox("Italic");
add (b1);
add(cb1);
add(cb2);
}
}