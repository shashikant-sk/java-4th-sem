import java.awt.*;
import javax.swing.*;
public class usingflowlayout
{
public static void main(String args[])
{
 JFrame f=new JFrame("Button");
 JLabel l1=new JLabel("Enter your name ");
 JTextField t1=new JTextField(20);
 JButton b=new JButton("Click Here");
 f.add(l1);
 f.add(t1);
 f.add(b);
 f.setSize(400,400);
 f.setLayout(new FlowLayout(FlowLayout.LEFT));
 f.setVisible(true); 
 }
 }
