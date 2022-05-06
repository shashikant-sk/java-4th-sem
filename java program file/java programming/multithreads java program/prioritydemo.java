class prioritydemo
{
priority t1,t2,t3;
public  prioritydemo()
{
t1= new priority();
t1.start();
t2= new priority();
t2.start();
t3= new priority();
t3.start();
}
public static void main(String args[])
{
	new prioritydemo();
	}
	}
	class priority extends Thread implements Runnable
	{
		int sleep;
		static int prio=3;
		public priority()
		{
			sleep +=100;
			prio++;
			setPriority(prio);
			}
			public void run()
			{
				try 
				{
					Thread.sleep(sleep);
		System.out.println("Name "+getName()+ "priority= "+getPriority());
					}
					catch(InterruptedException e)
					{
						System.out.println(e.getMessage());
						
					}
			}
	}

