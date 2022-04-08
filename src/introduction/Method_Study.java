package introduction;

public class Method_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//this is main method , call from here only
		System.out.println("this is main method");
		
		example4();
		example4();     // can call many times , write once call many times in same class
		
		// to call from another class. syntax is classname.methodname();
		Hellow_Java.test1();
			
	}
public static void example4() { //regular static method
	System.out.println("this is static regular method");
	
}
	
	
}
