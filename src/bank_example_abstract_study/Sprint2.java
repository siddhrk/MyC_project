package bank_example_abstract_study;

public abstract class Sprint2 extends Sprint1 {

	public static void main(String[] args) {
		 
	}
  public void NEFT() {
		System.out.println("abstract NEFT method complete in sprint2"); 
		}
   public void wallete() {
		System.out.println("abstract Wallete method complete in sprint2"); 
		}
   
   public void UPI_transfer() {
	   System.out.println("sprint2 requirement >>upi transfer");
   }
   public void FD() {
	   System.out.println("sprint2 requirement of FD");
   }
   public abstract void Adds(); //Abstract method due to lack of time it moves to sprint 3
}
