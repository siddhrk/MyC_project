package bank_example_abstract_study;

public class Sprint3 extends Sprint2 {

	public static void main(String[] args) {
		 Sprint3 sp=new Sprint3();
		 sp.loans(); //calling methods from sprint3
		 sp.Adds();
		 
		 sp.UPI_transfer(); //calling methods from sprint2
		 sp.FD();
		 sp.NEFT();
		 sp.wallete();
		 
		 sp.IMPS(); // calling methods from sprint1
		 check_balance(); 
		 view_transactions();		 
}
  public void Adds() {
	System.out.println("Adds method completed in sprint3");	 
		}
  public void loans() {
	  System.out.println("loans is the requirement of sprint 3");
  }
  
}
