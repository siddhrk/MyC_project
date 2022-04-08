package Constructor_Study;

public class CS3 {

	int num1;
	int num2;
	int num3;
	
	public CS3() // without parameters
	{
		num1=10;
		num2=20;
		num3=30;
	}
	public CS3(int a) // with single parameter user defined constructor
	{
	num1=a;
	}
	public CS3(int a,int b) // with two parameters
	{
		num1=a;
		num2=b;
	}
	public CS3(int a,int b,int c) // with three parameters
	{
		num1=a;
		num2=b;
		num3=c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CS3 c1=new CS3();
		c1.addition();
		
		CS3 c2=new CS3(100);
		c2.addition();
		
		CS3 c3=new CS3(200,200);
		c3.addition();
		
		CS3 c4=new CS3(50,60,70);
		c4.addition();
		
	}
public void addition() { // non static method
	int sum = num1+num2+num3;
	System.out.println("addition is "+sum);
	
}

}
