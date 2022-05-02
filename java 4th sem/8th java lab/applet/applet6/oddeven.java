import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class oddeven extends applet implements ActionListener {
	TextField t1 = new TextField(10);
	Label l1 = new Label("Enter numbet to Check");
	TextField t2 = new TextField(10);
	Label l2 = new Label("The Number is");
	Button b = new Button("Check");
	public void init(){
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			int n1=integer.parselnt(t1.getText());
			if(n1%2==0)
			t2.setText("Even Number");
			else 
			t2.setText("Odd number");
		}
	
		}
	}