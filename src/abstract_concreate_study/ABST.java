package abstract_concreate_study;

public abstract class ABST {

	public static void main(String[] args) {
		 
       //   ABST ab=new ABST(); // we can not create object in abstract class
        //  ab.demo1();
       demo();
       
	}
public static void demo() {
	System.out.println("this is static method with body");
}
   // public static void dem(); // this is static incomplete method>> becomes abstract 

   public void demo1() {
		System.out.println("this is complete method");
	}
	public void demo2() {
		// it has body so it also complete method
	}
	public abstract void demo3(); //incomplete method>>> it doesn't have body
}
