class subtract9
{
	public static void main(String args[])
	{
		int rows,columns;
		int a[][]={{1,5,6},{3,4,1},{1,2,3}};
		int b[][]={{2,0,3},{2,3,1},{1,2,1}};
		rows=3;
		columns=3;
		int diff[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				diff[i][j]=a[i][j]-b[i][j];
				}
				}
				System.out.println("subtraction of two matrix is");
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						System.out.print(diff[i][j]+"");
						}
						System.out.println();
						}
						}
						}