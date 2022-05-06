import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class user extends JFrame implements ActionListener
{
	JLabel firstname,lastname,email,username,password,mobile,l7;
	JTextField first,last,email1,user,mnum;
	JPasswordField p;
	JButton b;
	static Connection con;
	static Statement s;
	static ResultSet rs;
	 user()
	{
		Container c=getContentPane();
		c.setLayout(null);
		l7=new JLabel("New User Register");
		l7.setBounds(362, 52, 325, 50);
		l7.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		
		firstname=new JLabel("First name");
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		firstname.setBounds(58, 152, 99, 43);
		
		lastname=new JLabel("Last name");
		lastname.setBounds(58, 243, 110, 29);
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		email=new JLabel("Email address");
		email.setBounds(58, 324, 124, 36);
		email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		username=new JLabel("Username");
		username.setBounds(542, 159, 99, 29);
		username.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		password=new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
        password.setBounds(542, 245, 99, 24);
        
		mobile=new JLabel("Mobile Number");
		mobile.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mobile.setBounds(542, 329, 139, 26);
		
		first=new JTextField();
		first.setBounds(214, 151, 228, 50);
		first.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		last=new JTextField();
		last.setBounds(214, 235, 228, 50);
		last.setFont(new Font("Tahoma", Font.PLAIN, 32));
		last.setColumns(10);
		
		email1=new JTextField();
		email1.setBounds(214, 320, 228, 50);
		email1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		user=new JTextField();
		user.setBounds(707, 151, 228, 50);
		user.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		mnum=new JTextField();
		mnum.setBounds(707, 325, 230, 50);
		mnum.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
	
		p=new JPasswordField();
		p.setFont(new Font("Tahoma", Font.PLAIN, 32));
        p.setBounds(707, 235, 228, 50);
        
        b=new JButton("Register");
        b.setFont(new Font("Tahoma", Font.PLAIN, 32));
        b.setBounds(500, 500, 228, 50);
        
		c.add(l7);
		c.add(firstname);
		c.add(lastname);
		c.add(email);
		c.add(username);
		c.add(mobile);
		c.add(password);
		c.add(first);
		c.add(last);
		c.add(email1);
		c.add(user);
		c.add(mnum);
		c.add(p);
		c.add(b);
		
		b.addActionListener(this);
		
		setVisible(true);
		setSize(600,600);
		show();
		
	}
	
	
	public static void main(String args[])
	{
		user d=new user();
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:sc");
			s=con.createStatement();
			rs=s.executeQuery("select first sname,last sname from User_Registration");
			rs.next();
			
		}
		catch(Exception e)
		{
			System.out.println("Error"+e.toString());
			e.printStackTrace();
		}
	
		
	
		
		}
		public void actionPerformed(ActionEvent e)
	{
	
		String mobile=mnum.getText();
		int len=mobile.length();
		
		
		if(len !=10)
		{
			JOptionPane.showMessageDialog(b,"Enter a valid mobile number");
		}
		
	if (e.getSource()==b)
	{
	
		try
		{
s.executeUpdate("insert into User_Registration values("+first.getText()+"',"+last.getText()+"','"+email1.getText()+"','"+user.getText()+"','"+p.getText()+"','"+mnum.getText()+"')");
			System.out.println("one row is inserted");
		}
		catch(Exception e1)
		{
			System.out.println(e1.toString());
		}
	}
	}
	
	}