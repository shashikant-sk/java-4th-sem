import java.awt.*;
import java.awt.event.*;
import java.swing.*;
public class shashi implements ActionListener
{
JLabel L1,L2,L3,L4;
JTextField t1,t2,t3,t4;
JButton b1,b2;
public shashi
{
	JFrame f=new JFrame("Swing Frame:");
	L1=new JLabel("Enter the principle:");
	 t1=new JTextField(10);
	L2=new JLabel("Enter the Time:");
     t2=new JTextField(10);
     L3=new JLabel("Enter the rate:");
     t3=new JTextField(10);
     L4=new JLabel("simple interest:");
     t4=new JTextField(10);
     b1=new JButton("ok");
     b1.addActionListner(this);
     f.add(L1);
     f.add(t1);
     f.add(L2);
     f.add(t2);
     f.add(L3);
     f.add(t3);
     f.add(L4);
     f.add(t4);
     f.add(b1);
 f.setSize(400,100);
f.setLayout(new FlowLayout(FlowLayout.LEFT)); 
 f.setVisible(true);
} 
 public void actionPerformed(ActionEvent e)
 {
 	if(e.getSource()==b1)
 int P=Integer.parseInt(t1.getText());
 int T=Integer.parseInt(t2.getText());
 int R=Integer.parseInt(t3.getText());
 int si=(P*T*R)/100;
 t4.setText(String.valueOf(si));
 }
 }
 public static void main(String args[])
 {
 	shashi ss=new shashi();
 	}
 	}
     
	

	 