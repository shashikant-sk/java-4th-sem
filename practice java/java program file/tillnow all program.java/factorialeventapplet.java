import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class factorialeventapplet extends Applet implements ActionListener
{
Label L1,L2;
TextField T1,T2;
Button b1;
public void init()
{
	L1=new Label("Enter the No.");
	L2=new Label("Enter Factorial of input number");
	T1=new TextField(20);
	T2=new TextField(20);
	b1=new Button("find");
	b1.addActionListener(this);
	add(L1);
	add(T1);
	add(L2);
	add(T2);
	add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==b1)
		{
			String number = T1.getText();
				int num = Integer.parseInt(number);
				long fac=num; 
				0?				for (int i=num;i>1;i--) 
				{
				fac=fac*(i-1);
				}
				T2.setText(Long.toString(fac));
		}
	}	
	}
		