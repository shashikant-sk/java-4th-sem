class HandleError
 {
public static void main(String args[]) 
{
int r,a=0,b=0,c=0;
for(int i=0; i<32000; i++) 
{
try
{
a = 12345 / (b/c);
} 
catch (Exception e)
{
System.out.println("Division by zero.");
a = 0;
}
System.out.println("a: " + a);
}
}
}