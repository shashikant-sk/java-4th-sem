import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class da21 extends Frame implements ActionListener
{
	static Connection con;
	static Statement sa;
	static ResultSet rs;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	Panel p;
	public da21()
	{
		super("using database ");
		setBackground(Color.gray);
		
		l1=new Label("roll");
		l2=new Label("name");
		t1=new TextField(10);
		t2=new TextField(10);
		b1=new Button("Exit");
		b2=new Button("next");
		b3=new Button("save");
		b4=new Button("clear");
		p=new Panel();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.setLayout(new GridLayout(4,2));
		add(p);
		pack();
		setVisible(true);
				}
	
	public static void main(String args[])
	{
		da21 d=new da21();
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:ww");
			sa=con.createStatement();
			rs=sa.executeQuery("select roll,sname from student");
			rs.next();
			}
			catch(Exception e)
			{
			System.out.println("error"+e);		
			}
			d.show(rs);
			}
			public void actionPerformed(ActionEvent e2)
			{
				if(e2.getSource()==b1)
			{
			try
			{
				System.exit(0);
			}
			catch(Exception e)
			{
			}		
				}
				else if(e2.getSource()==b2)
				{
					try
					{
						rs.next();	
					}
					catch(Exception e)
					{
					}
					show(rs);
				}
				
				else if(e2.getSource()==b3)
				{
					try
					{
						sa.executeUpdate("insert into student values('"+t1.getText()+"','"+t2.getText()+"')");
					System.out.println("one record saved");
						}
						catch(Exception e)
				{
					System.out.println("error");
				}
				show(rs);
			}
			else if(e2.getSource()==b4)
			{
				try
				{
					t1.setText("");
					t2.setText("");
				}
				catch(Exception e)
				{
					
				}
			}
			
	}
	public void show(ResultSet rs)
	{
		try
		{
			t1.setText(rs.getString(1));
			t2.setText(rs.getString(2));
		}
		catch(Exception e)
		{
		//	System.out.println("error"+e);
		}
	}
	
} 