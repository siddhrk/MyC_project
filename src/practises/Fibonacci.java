package practises;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1, c, i, count = 10;
		System.out.println("this is first fibonacci series");
		 
		for (i = 1; i <= count; i++) {
			c = a + b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
