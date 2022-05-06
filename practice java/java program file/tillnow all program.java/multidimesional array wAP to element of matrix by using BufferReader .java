import java.io.*;
class darr2
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,j;
int m[][]=new int[3][3];
System.out.println("Enter number of elements");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The elements of array :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
}