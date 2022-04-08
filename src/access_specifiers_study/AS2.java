package access_specifiers_study;

public class AS2 {

	public static void main(String[] args) {
		 // calling access specifiers
		AS1 as=new AS1();
		as.sid3(); // public AS >> scope= throughout PROJECT
		as.sid2(); //protected >> scope= package+ outside package by using inheritance
		as.sid4(); //default >> scope= within package only
System.out.println("calling private member in other class not possible because its scope remains within class only");

	}

}
