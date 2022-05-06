class mm
{
	void min(int arr[])
{
	int min=arr[0];
	for (int i=1;i<arr.length;i++)
	{
		if(min>arr[i])
	min=arr[i];
	}
	System.out.println(min);
	}
	}
	class smian
	{
		public static void main(String args[])
	{
		mm m=new mm();
	int a[]={33,3,4,5};
		m.min(a);
		}
		}