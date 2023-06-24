package BankAssignment;

public class Bank {
	
private int pinnumber;
public void setName(int pinnumber)
{
this.pinnumber = pinnumber;	
}
public int getName()
{
	return pinnumber;
}
public void verify()
{
	if(pinnumber==1001)
	{
		System.out.println("Valid pin");
	}
	else if (pinnumber == 1234)
	{
		System.out.println("Valid pin");
	}
	else if (pinnumber == 1212)
	{
		System.out.println("Valid pin");
	}
	else
		System.out.println("Invalid pin");
}
}
