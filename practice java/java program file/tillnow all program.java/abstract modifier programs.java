abstract class Sum
{
public abstract void sumOfTwo(int n1, int n2);
 public abstract void sumOfThree(int n1, int n2, int n3);
 void disp()
   {
	System.out.println("Method of class Sum");
   }
}
class Demo extends Sum
{
	public void sumOfTwo(int num1, int num2)
	{
	System.out.println(num1+num2);
	}
  public void sumOfThree(int num1, int num2, int num3)
  {
	System.out.println(num1+num2+num3);
	 } 
	 }
	 class smain
	 {
   public static void main(String args[])
   {
	Sum s = new Demo();
	s.sumOfTwo(2,3);
	s.sumOfThree(2,3,4);
	}
   }
   