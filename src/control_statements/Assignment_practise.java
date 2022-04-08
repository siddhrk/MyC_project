package control_statements;

public class Assignment_practise {

	public static void main(String[] args) {
		
		 int age = 24;
		float height=5.67f;
		 
		if(age<=30 & age>21) {
			System.out.println("you are eligible for sti exam");
		
		if(age>21 & age<=30 & height>5.5)
		{
			System.out.println("you are eligible for psi exam");
		}
		else {
			System.out.println("not eligible for psi");
		}
		}
		else {
			System.out.println("not eligible for both");
		}
	}

}
