package bank_example_abstract_study;

public abstract class Sprint1 {

	public static void main(String[] args) {
		 //Sprint1 sp=new Sprint1();
		 //sp.IMPS(); // we can not create object in abstract class in non static method
	//we can call static method in abstract class
		check_balance();
		view_transactions();
	}
public void IMPS() {
	System.out.println("money transfer through IMPS");
}
public static void check_balance() {
	System.out.println("check balance is requirement of sprint1");
}
public static void view_transactions() {
	System.out.println("user can view all transactions is a requirement from sprint1");
}
public abstract void NEFT(); //Abstract method due to lack of time it moves to sprint 2
public abstract void wallete(); //Abstract method due to lack of time it moves to sprint 2 
}
