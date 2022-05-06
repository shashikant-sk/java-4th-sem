import java.awt.*;
import javax.swing.*;
public class Jfa extends JApplet
{
	public void init()
	{
		getContentPane().setLayout(new FlowLayout());
		ImageIcon ic=new ImageIcon("a.gif");
		JLabel L1=new JLabel(ic);
		getContentPane().add(L1); 
	}
}