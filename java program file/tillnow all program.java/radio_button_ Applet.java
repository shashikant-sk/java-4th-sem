import java.awt.*;
import java.applet.*;
public class  radio_button_Applet extends Applet
{
Checkbox cb1,cb2,cb3;
CheckboxGroup cb;
public void init ( )
{
	cb = new CheckBoxGroup ( );
cb1 = new Checkbox ("Bold",cb,false);
cb2 = new Checkbox ("Italic",cb,false);
cb3 = new Checkbox ("Plain",cb,true);
add(cb1);
add(cb2) ;
add (cb3);
}
}