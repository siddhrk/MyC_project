package inheritance_study;

public class Multilevel {

	public static void main(String[] args) {
		 
      Constitution c=new Constitution();  // object of supermost class
      c.powers(); //can call its own properties only
      c.rights();
      
     Aspirant a=new Aspirant(); //object of super class
     a.prelims();
     a.mains();
     a.ias();
     a.ips();
     a.powers();
     a.rights();
   
     UPSC u=new UPSC();  // object of child class
    	u.ias();
        u.ips();
        u.powers();
        u.rights();
       
	}

}
