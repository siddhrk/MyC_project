package practises;

import access_specifiers_study.AS1; //to call public in different package use import
           //syntax>> packagename.classname

public class AS extends AS1 {

	public static void main(String[] args) {
		 AS1 as=new AS1(); //creating object of AS1 class
		 as.sid3(); //calling public sid3 method
		 
		 AS a=new AS(); //creating object of this class
		 a.sid2(); //calling protected sid2 method from AS1 class
		
	//can not call private and default method in other packages
		 
		 
	}


}
