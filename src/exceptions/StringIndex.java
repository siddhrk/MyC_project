package exceptions;

public class StringIndex {

	public static void main(String[] args) {

		String city = "nanded"; // index is 5 and length is 6

		try {
			System.out.println(city.charAt(8)); // if this is not exception then only try block will be print and catch
												// block will not execute
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("enter charAt argument in between 0-5");
		}

	}

}
