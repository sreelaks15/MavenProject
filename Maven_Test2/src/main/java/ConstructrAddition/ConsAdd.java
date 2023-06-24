package ConstructrAddition;

public class ConsAdd {
	int c;
public ConsAdd(int a, int b)

{
c =a+b;
}
public void add()
{
System.out.println(c);
}

public static void main(String args[])
{
	ConsAdd o = new ConsAdd(5,6);
	o.add();
}
}
