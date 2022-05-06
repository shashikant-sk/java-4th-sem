import java.io.*;
class Mythread extends Thread
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("the current thread is:"+t);
		t.setName("myJavaThread");
		System.out.println("the thread is now named as:"+t);
		try 
		{
			for(int i=0;i<3;i++)
			{
				System.out.println(i);
				Thread.sleep(2500);
      }
}
catch(InterruptedException e)
{
System.out.println("main thread interupted");
}
}
}