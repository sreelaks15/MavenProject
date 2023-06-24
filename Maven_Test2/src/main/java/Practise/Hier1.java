package Practise;

public class Hier1 extends Hierarchical
{
	public void sub()
	{
		System.out.println("Nice to meet you");
	}

	public static void main(String[] args) 
	{
		Hier1 m = new Hier1();
		m.add();
		m.sub();

	}

}
