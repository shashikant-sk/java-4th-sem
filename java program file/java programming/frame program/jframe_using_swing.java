import java.awt.*;
import javax.swing.*;
public class jframe_using_swing extends Frame
{
	public jframe_using_swing(String title)
	{
		super(title);
		}
		public static void main(String args[])
		{
			jframe_using_swing j=new jframe_using_swing("using swing");
			j.setVisible(true);
			j.setSize(200,200);
			}
		}