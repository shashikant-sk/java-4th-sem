import java.awt.*;
import java.applet.*;
public class lable extends Applet
{
Label L1,L2;
public void init()
{
L1 = new Label("java program");
L2 = new Label("Awt components");
add(L1);
add(L2);
}
}