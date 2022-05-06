import java.io.*;
import mm.ff;
class eo
{
	public static void main(String args[])throws IOException
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no.");
		n=Integer.parseInt(br.readLine());
		ff c=new ff();
		int s=c.comp(n);
		if(s==0)
		System.out.println("even"+n);
		else
		System.out.println("odd"+n);
		}}
		