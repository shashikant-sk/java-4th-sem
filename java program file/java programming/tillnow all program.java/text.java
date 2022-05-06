import java.awt.*;
import java.applet.*;
public class text extends Applet
{
	Label L1,L2;
	TextField T1,T2;
	Button b1;
	public void init()
	{
		L1=new Label("Name");
		L2=new Label("Address");
		T1=new TextField(20);
		T2=new TextField(20);
		b1=new Button("ok");
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(b1);
		}
	}