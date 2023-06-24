package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		ArrayList <String> a =  new ArrayList <String>();
		a.add("Sree");
		a.add("Sharon");
		a.add("sanju");
		a.add("akhil");
		a.add("hari");
		Iterator it = a.iterator();
		System.out.println("Iterator elements");
		while(it.hasNext())
			System.out.println(it.next()+" ");
		
		int y = a.size();
		System.out.println(y);
		System.out.println(a);
		//a.remove(2);
		//System.out.println(a);
		//a.removeAll(a);
		//System.out.println(a);
		boolean x = a.contains("Sree");
		System.out.println(x);
		
		
		
		
		

	}

}
