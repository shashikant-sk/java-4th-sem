interface face
{
	void disp();
	}
	class ss implements face
	{
	public void disp()
		{
			System.out.println("using concept of multiple interface");
		}
	}
	    class kk extends ss implements face
	    {
	public void disp()
		{
			float p,r=1;
			p=2*r*22/7;
			System.out.println("circle of perimeter"+p);
			}
			}
			class smain
			{
				public static void main(String args[])
				{
					ss s=new ss();
					s.disp();
					kk k=new kk();
					k.disp();
					}
					}