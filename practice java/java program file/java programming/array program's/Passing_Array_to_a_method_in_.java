//to get the minimum number of an array using a method
class mm
{
	void minimum(int array[])
	{
		int minimum=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(minimum>array[i])
			minimum=array[i];
			}
			System.out.println(minimum);
			}
			}
			class smain
			{
			public static void main(String args[])
			{
				mm m=new mm();
				int a[]={33,41,21,14};
				m.minimum(a);	
			}
		}		