public class prog1 {
	public static void main(String[] args) {
		String s = "abcd";

		foo(null);
		bar(null);
	}

	
	static void foo(String x){
		try {
			System.out.println("First character: " + x.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException thrown!");
		}
	}

	
	static void bar(String x){
		if(x != null)
			System.out.println("First character: " + x.charAt(0));
		else
			System.out.println("NullPointerException thrown!");
	}
}