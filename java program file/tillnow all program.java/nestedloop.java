class nestedloop
{
	public static void main(String args[])
	{
		int i,j,k=0;
		for(i=1;i<=3;i++)
		{
			for(j=i;j<=3;j++)
			{
				k++;
				System.out.print(k);
				}
				System.out.println();
		}
	}
}