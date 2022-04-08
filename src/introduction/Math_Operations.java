package introduction;

public class Math_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  addition(); //this is static method call
  //to call non static method >> create a object > syntax >> classname objectname= new classname();
  Math_Operations nst= new Math_Operations();
  
  nst.substraction(); // syntax is >> objectname.methodname();
  	
	}

	public static void addition()
	{
		int a=10;
		int b=20;
		int sum;
		sum=a+b;
	System.out.println("addition is " +sum);	
		
	}
	public void substraction() {
		int a=40;
		int b=30;
		int sub;
		sub=a-b;
		System.out.println("substraction is "+sub);
		
	}
	
}
