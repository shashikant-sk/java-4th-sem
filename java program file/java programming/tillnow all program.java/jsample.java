import java.awt.*;
import javax.swing.*;
public class jsample
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JButton b=new JButton("click me");
		b.setBounds(130,100,100,40);
f.add(b);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}
}