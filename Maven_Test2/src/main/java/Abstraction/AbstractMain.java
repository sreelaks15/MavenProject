package Abstraction;

public class AbstractMain extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractMain o = new AbstractMain();
o.sum();
o.add();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}

}
