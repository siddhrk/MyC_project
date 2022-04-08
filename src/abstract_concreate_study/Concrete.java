package abstract_concreate_study;

public class Concrete extends ABST {

	public static void main(String[] args) {
		 Concrete c=new Concrete(); 
		 c.demo1(); //calling methods from ABST class
		 c.demo2();
		 c.demo3(); //calling method demo3 which is completed in concrete class
		 c.demo4(); //calling method from concrete class
		 demo(); //static method from ABST class with body
		
	}
     public void demo3() {
		System.out.println("method completed in concrete class"); 
		}
 public void demo4() {
	 System.out.println("this is method from concrete class itself");
 }
	
	
}
