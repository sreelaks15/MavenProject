package EcxeptionHandling;

import java.io.IOException;


public class Excep1 {
	
		void m() throws IOException
		{
		throw new IOException("device error");
		}
		void n() throws IOException
		{
		m();
	}
	

		public static void main(String args[]) throws IOException
		{
			Excep1 obj = new Excep1();
			obj.m();
			System.out.println("normal flow");
		}
	}
