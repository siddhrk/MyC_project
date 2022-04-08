package polymorphism_study;

public class Overloading {

	public static void main(String[] args) { //overloading>> many methods with same name but different parameters
		Overloading o=new Overloading();         //^
		o.demo(10, 20);                          //^
		o.demo(20, 20, 30); // multiple methods with the same method name but difft. parameters
		o.demo(15, 25, 50);
		o.demo(100.11f, 55.50f);
		
		 

	}
public void demo(int a,int b) {
	int sum=a+b;
	System.out.println("sum is "+sum);
}
public void demo(int a,int b,int c) {
	int sum=a+b+c;
	System.out.println("sum is "+sum);
}
public void demo(float a,float b) {
	float sub=a-b;
	System.out.println("sub is "+sub);
}
}
