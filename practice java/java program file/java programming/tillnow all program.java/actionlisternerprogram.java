import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class actionlisternerprogram extends Applet implements ActionListener
{
	Label L1,L2,L3;
	TextField T1,T2,T3;
	Button b1;
	public void init()
	{
		L1=new Label("Enter 1no.");
		L2=new Label("Enter 2no.");
		L3=new Label("sum");
		T1=new TextField(20);
		T2=new TextField(20);
		T3=new TextField(20);
		b1=new Button("ok");
		b1.addActionListener(this);
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(L3);
		add(T3);
		add(b1);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				int n=Integer.parseInt(T1.getText());
				int m=Integer.parseInt(T2.getText());
		     	int	b=m+n;
				T3.setText(String.valueOf(b));
		}
	}
	}