package control_statements;

public class Else_if {

	public static void main(String[] args) {
	 // if my marks are
		// >68 >>first class
		// 50-68 >>second class
		// >=40 >>you are pass only
		
		int marks=75;
		if(marks>=68)
		{
			System.out.println("you are in first class");
		}
		else if(marks>50 & marks<=68)
		{
			System.out.println("you are in second class");
		}
	   else if(marks>=40)
	 {
		System.out.println("you are pass only");
	 }
		
	   else {
		   System.out.println("you are failed");
	   }
}
}