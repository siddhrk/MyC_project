package keywords_study;

public class Super_Study extends Exa {
 	
 int s=50; //global non static variable
 static int r=100;
	public static void main(String[] args) {
		  
		 Super_Study ss=new Super_Study();
		 ss.display();
System.out.println("calling static global variable r is "+r);
	}
	public void display() //non static method
	{
		int b=900;
		int sum;
		sum=super.i+s;
		System.out.println("sum is "+sum);
		sum=b+super.j;
		System.out.println("addition by using super keyword is "+sum);
		System.out.println("caling global non static varible s is >>>> "+s);
		
		sum=r+b;
		System.out.println("sum of static global and non static local variable is "+sum);
	}
}
