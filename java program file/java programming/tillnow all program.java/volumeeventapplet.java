import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class volumeeventapplet extends Applet implements ActionListener
{
	Label L1,L2,L3,L4;
	TextField T1,T2,T3,T4;
	Button b1;
	public void init()
	{
		L1=new Label("Enter length");
		L2=new Label("Enter height");
		L3=new Label("Enter breadth");
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
		add(T2);
		add(L3);
		add(T3);
		add(L4);
		add(T4);
		add(b1);
		}
		public void actionPerformed(ActionEvent e)
		{
			 if(e.getSource()==b1)
			{
				int l=Integer.parseInt(T1.getText());
				int b=Integer.parseInt(T2.getText());
				int h=Integer.parseInt(T3.getText());
				int v=l*b*h;
				T4.setText(String.valueOf(v));
			}
		} 
}
