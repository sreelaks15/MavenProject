package BankAssignment;
import java.util.Scanner;
public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a pin number");
		int pinnumber = sc.nextInt();
		Bank o = new Bank();
		o.setName(pinnumber);
		o.getName();
		o.verify();

	}

}
