import java.util.*;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String str0 = "ABCD";
		String str1 = str0.toLowerCase();
		String str2 = "abcd";
		String str3 = str2.toUpperCase();
		
		String str4 = "PriyansuRath JOD";
		StringBuilder strb0 = new StringBuilder();
		strb0.append(str4).reverse();
		String str5 = strb0.toString();
		System.out.println("LowerCased = "+ str1+ " UpperCased = "+ str3+"Reversed = "+ str5);
		
		String a = "CompareOne";
		String b = "Comp";
		System.out.println(a.equals(b));
		
		String str = "Sugoi Desai";
		StringBuffer resString = new StringBuffer(str);
		System.out.println(resString.insert(5, " ONI CHAN"));
		sc.close();
	}

}