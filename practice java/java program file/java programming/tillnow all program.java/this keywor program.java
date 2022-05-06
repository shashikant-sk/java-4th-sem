class sup
{
	int star;
	sup(int star)
	{
		this.star=star;
		System.out.println("this reference"+this);
		}
}
class smain
{
	public static void main(String args[])
	{
		sup s=new sup(8);
		System.out.println("object reference"+s);
	}
}