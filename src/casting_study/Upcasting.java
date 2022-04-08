package casting_study;

public class Upcasting {

	public static void main(String[] args) {
		 Son s=new Son();
		 s.bike();
		 s.mobile();
		 s.degree(); //own method of son
		 
		 Father f=new Son(); //creating object of sub class
		 //by using father reference we can call son's methods
		 f.bike();
		 f.mobile();
		// f.degree(); // can not call because it is not a common method

	}

}
class Father {
	public void bike() {
		System.out.println("apache basic");
	}
	public void mobile() {
		System.out.println("samsung");
	}
}
class Son extends Father{
	public void bike() {
		System.out.println("apache rtr200");
	}
	public void mobile() {
		System.out.println("oneplus");
	}
	public void degree() {
		System.out.println("BE");
	}
}