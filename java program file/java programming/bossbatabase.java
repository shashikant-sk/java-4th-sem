import java.sql.*;
class dsa
{
public static void main(String args[])
{
Connection con;
Statement sa;
ResultSet rs;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

con=DriverManager.getConnection("jdbc:odbc:boss");
sa=con.createStatement();
rs=sa.executeQuery("select * from boss");
while(rs.next())
{
System.out.print(rs.getString(1)+" ");
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
System.out.println(rs.getString(4));
System.out.println(rs.getString(5));
System.out.println();
}
}
catch(Exception e){
System.out.println(e.toString());
}
}
}