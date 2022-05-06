import java.awt.*;
public class listexample
{
	public static void main(String args[])
	{
		Frame f=new Frame("listexample");
		Label L1,L2,L3,L4;
		L1=new Label("1st Item");
		L1.setBounds(50,100,100,30);
		L2=new Label("2nd Item");
		L2.setBounds(50,150, 100,30);
		L3=new Label("3rd Item");
		L3.setBounds(50,200, 100,30);
		L4=new Label("4th Iteam");
		L4.setBounds(50,250,100,30);
		f.add(L1);
		f.add(L2);
		f.add(L3);
		f.add(L4);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
}
}