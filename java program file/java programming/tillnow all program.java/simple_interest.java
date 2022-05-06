	import java.io.*;
class simpleinterest
{
	public static void main(String args[])throws IOException
	{
		double p,t,r,si;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the principle");
		p=Double.parseDouble(br.readLine());
		System.out.println("enter the rate");
		r=Double.parseDouble(br.readLine());
		System.out.println("enter the time");
		t=Double.parseDouble(br.readLine());
		si=p*t*r/100;
		System.out.println("simple interest");
		}
		}