import java.awt.*;
public class fra extends Frame
{
	Label a,b;
	public fra()
	{
		setLayout(new FlowLayout());
		a=new Label("using GUI components");
		b=new Label("using Frame in program");
		add(a);
		add(b);
		}
		public static void main(String args[])
		{
			fra f=new fra();
			f.setVisible(true);
			f.setSize(200,200);
			}
}