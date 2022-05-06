import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Vector<String> vec = new Vector<String>();
		String st="";
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)==' ')
		    {
		        if(st.length()>0)
		          vec.add(st);
		        st="";
		    }
		    else
		      st=st+s.charAt(i);
		}
		if(st.length()>0)
		    vec.add(st);
		
		if(vec.size()>2)
		  {
		      System.out.println(vec.get(1));
		  }s
		  else
		  {
		      System.out.println("No Middle Name");
		  }
		
	}
}