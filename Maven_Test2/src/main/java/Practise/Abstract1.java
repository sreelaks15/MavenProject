package Practise;

public class Abstract1 extends Abstract
{
	public static void main(String args[])
	{
		Abstract1 o = new Abstract1();
		o.sum();
		o.add();
	}

	@Override
	public void add() {
		int a=5,b=6,c=a+b;
		System.out.println(c);
		
	}

}
