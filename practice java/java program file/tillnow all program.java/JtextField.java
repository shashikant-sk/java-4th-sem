import java.awt.*;
import javax.swing.*;
public class JtextField extends JFrame
{
public  JtextField()
{
Container con=getContentPane();
con.setLayout(new FlowLayout());
JLabel l1=new JLabel("Enter your name ");
JTextField t1=new JTextField(20);
con.add(l1);
con.add(t1);
setVisible(true);
setSize(200,200);
}
public static void main(String args[])
{
JtextField j=new JtextField();
}
}