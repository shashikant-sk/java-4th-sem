import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class simpleintrestappleteventimplementsactionlistener extends Applet implements ActionListener
{
	Label L1,L2,L3,L4;
	TextField T1,T2,T3,T4;
	Button b1;
	public void init()
	{
		L1=new Label("Enter principal");
		L2=new Label("Enter time");
		L3=new Label("Enter rate");
		L4=new Label("Enter Result");
		T1=new TextField(20);
		T2=new TextField(20);
		T3=new TextField(20);
		T4=new TextField(20);
		b1=new Button("ok");
		b1.addActionListener(this);
		add(L1);
		add(T1);
		add(L2);
		add(T1);
		add(L3);
		add(L4);
		add(b1);
		}
		public void actionperformed(ActionEvent e)
		{
			if(e.getsource()==b1)
			{
				int p=Integer.parseInt(T1.getText());
				int t=Integer.parseInt(T2.getText());
				int r=Integer.parseInt(T3.getText());
				int si=(p*t*r)/100;
				T4.setText(String.valueOf(si));
			}
		} 
}
