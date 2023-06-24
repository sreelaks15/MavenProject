package Final;

public class Add {
final int a=10; // value should be initialized here itself.
public void add()
{
	//a=10; here it cant be given because final keyword is used.. so we need to declare value of a outside the method
System.out.println("hallo");
}

public static void main(String args[])
{
	Add o = new Add();
	o.add();
	System.out.println(o.a);
}
}
