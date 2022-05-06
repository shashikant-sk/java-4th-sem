import java.io.*;
import mypackage.cal;
public class student
{
public static void main (String args [ ])
{
 mypackagecal c = new mypackagecal( );
int s = c.volume (5, 10, 20);
System.out.println ("volume is”"+s);
int z = c.sqr (5);
System.out.println ("square volume is"+ z);
}}