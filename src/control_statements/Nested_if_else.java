package control_statements;

public class Nested_if_else {

	public static void main(String[] args) {
		 
		// see example of Facebook account
		//we need id and password so >>>
		String ID="sid1";
		String Pass="sid7890";
		
		System.out.println("=================================");
		
		if(ID=="sid1") {
			System.out.println("please enter password");
	
		if(Pass=="sid7890") 
		  {	
			System.out.println("login successful");
		   }
		else {
			System.out.println("please enter correct password");
		}
	}   
		else {
			System.out.println("incorrect user id");
		}
		
	System.out.println("=================================");	
}
}