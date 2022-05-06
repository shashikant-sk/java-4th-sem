import java.io.*;
class namefromuser
{
	public static void main(String args[])throws IOException
	{
	String name;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	name=br.readLine();
	System.out.println("yourname is "+name);
	}
}