package exceptions;

import javax.xml.catalog.Catalog;

public class Multiple_Try_And_Catch {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int div = a / b;
			System.out.println(div);
		}

		catch (NullPointerException e) {
			System.out.println("can not perform actions on null values");
		}

		catch (StringIndexOutOfBoundsException e) {
			System.err.println("check string index");
		}

		catch (ArithmeticException e)  //whichever the exception it will execute first
		{
			System.out.println("divided by zero is not possible");
		}

		 catch (Exception e) {
				System.out.println("Generic Exception caught");
			}
		
		finally {
			System.out.println("finally block will execute always");
		}
		
	}

	 
	
	
}
