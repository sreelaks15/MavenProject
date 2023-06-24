package RBI;

public class HDFC implements Rbi {
	public static void main(String args[])
	{
		HDFC h = new HDFC();
		h.recurringdeposit();
	}

	public void recurringdeposit() {
		// TODO Auto-generated method stub
	float principle = 100000;
	float time = 5;
	float interest= (principle * rate * time )/100;
	float amount = interest + principle ;
	System.out.println("The total amount is "+ amount);
	
		
		
	}

}
