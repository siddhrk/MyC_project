package interface_study;

public class imp implements My_Interface {

	public static void main(String[] args) {
		System.out.println(a); // calling variable from interface
		imp i = new imp();
		i.test1(); // calling interface methods
		i.test2();
		i.demo(); // calling own methods
 
	}
 
	@Override
	public void test1() {
		System.out.println("test1 method complete in implementation class");
	}

	@Override
	public void test2() {
		System.out.println("test2 method complete in implementation class");
	}

	public void demo() {
		System.out.println("own method");
	}
}
