import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class jlab3 implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton b1;
public jlab3()
{
 JFrame f=new JFrame("Swing Frame:");
 l1=new JLabel("Enter your no:");
 t1=new JTextField(10);
 l2=new JLabel(" Result ");
 t2=new JTextField(10);
 b1=new JButton("OK");
 b1.addActionListener(this);
 f.add(l1);
 f.add(t1);
 f.add(l2);
 f.add(t2);
 f.add(b1);
 f.setSize(400,100);
f.setLayout(new FlowLayout(FlowLayout.LEFT)); 
 f.setVisible(true);
} 
public void actionPerformed(ActionEvent e)
{
if(e.getSource( )==b1)
{
int n=Integer.parseInt(t1.getText());
int m=1,i;
for(i=1;i<=n;i++)
{
m=m*i;
}
t2.setText(String.valueOf(m));
}
}
public static void main(String args[])
{
  jlab3 jl=new jlab3();
}
}
