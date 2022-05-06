class ss
{
	public static void main(String args[])throws IOException
	{
	int i,n,s=0;
	BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter the number");
	n=Integer.parseInteger(br.readLine());
	for(i=1;i<=n;i++)
	s=s+i;
	{
		System.out.println("natural is"+n );
		System.out.println("sum is"+s);
		}
	}
	}
	
//	mport java.util.Scanner;
//public class Demo {
//
//    public static void main(String[] args) {
//
//        int num, count, total = 0;
//
//        
//        System.out.println("Enter the value of n:");
//        //Scanner is used for reading user input
//        Scanner scan = new Scanner(System.in);
//        //nextInt() method reads integer entered by user
//        num = scan.nextInt();
//        //closing scanner after use
//        scan.close();
//        for(count = 1; count <= num; count++){
//            total = total + count;
//        }
//
//        System.out.println("Sum of first "+num+" natural numbers is: "+total);
//    }
//}