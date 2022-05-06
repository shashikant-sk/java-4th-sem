import java.io.*;
class  enter_your_name_BufferedReader
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String na=new String();
		System.out.println("enter your name");
		na=br.readLine();
		System.out.println("your name is"+na);
		}
		}