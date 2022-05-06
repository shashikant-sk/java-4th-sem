import javax.swing.*;
public class jb
{
public static void main(String[] args)
{
 JFrame f=new JFrame("Button");
 JLabel l1=new JLabel("Enter your name ");
 l1.setBounds(10,10,100,50);
 JTextField t1=new JTextField(50);
 t1.setBounds(120,10,100,30);
 JButton b=new JButton("Click Here");
 b.setBounds(120,55,95,30);
 f.add(l1);
 f.add(t1);
 f.add(b);
 f.setSize(450,450);
 f.setLayout(null);
 f.setVisible(true);
 }
 }