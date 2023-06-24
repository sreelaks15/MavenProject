package Exception;

public class Excep {
	public void add()
	{
		try
		{
		int a=5,b=0,c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("Not possible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Excep o = new Excep();
o.add();
	}

}
