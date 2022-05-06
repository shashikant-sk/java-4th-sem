import java.util.*;
class totalof5subject
{
	public static void main(String args[])
	{
		int english,physics,computer,chemistry,math;
		float Total,Percentage,Average;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the 5 subject marks:");
		english=sc.nextInt();
		chemistry=sc.nextInt();
		physics=sc.nextInt();
		computer=sc.nextInt();
		math=sc.nextInt();
		Total=english+physics+computer+chemistry+math;
		Average=Total/5;
		Percentage=(Total/500)*100;
		System.out.println("Total: "+Total);
		System.out.println("Average: "+Average);
		System.out.println("Percentage: "+Percentage);
		}
		}