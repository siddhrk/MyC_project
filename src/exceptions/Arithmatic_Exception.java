package exceptions;

public class Arithmatic_Exception {

	public static void main(String[] args) {

		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			
			System.out.println("can not be divided by zero"); 
		}
		
		System.out.println("this is arithmatic exception");
	}
}