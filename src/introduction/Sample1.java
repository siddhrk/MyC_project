package introduction;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// to call non static method i have to create a object 
		// syntax >> classname objectname= new classname();
		Sample1 d1 = new Sample1();

		d1.demo(); // to call non static method syntax >> objectname.methodname();
		d1.demo();
		d1.demo();

	}

	public void demo() // non static becaue it not have static keyword
	{
		System.out.println("this is non static method");

	}
}
