package inheritance_study;

public class Hierarchical {

	 public static void main(String[] args) {
		Asp as = new Asp();  // object of sub class
		as.prelims(); // calling properties from own class 
		as.mains();
		
	    as.powers(); //calling properties from super class
		as.rights();
	System.out.println("=============================");	
		
		UPSC u=new UPSC(); 
		u.ias(); // calling properties from own class
		u.ips();
		
		u.powers(); //calling properties from super class
		u.rights();
		
		
	}

	
	
	
	
}
