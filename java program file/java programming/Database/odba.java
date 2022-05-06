	import java.sql.*;  
class odba
{  
public static void main(String args[]){  
	try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver"); 
//step2 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");  

//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from student3");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
  
//step5 close the connection object  
con.close();    
}catch(Exception e)
{ System.out.println(e);}  
}
}
 
