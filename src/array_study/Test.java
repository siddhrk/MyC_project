package array_study;

public class Test {

	public static void main(String[] args) {
		 String name1="velocity";
		 String name2="corporate";
		 String name3="training";
		 String name4="centre";
		 
		 //1.declaration
		 String institute[]=new String[5];
		 
		 //initialization
		 institute[0]="velocity";
		 institute[1]="corporate";
		 institute[2]="training";
		 institute[3]="centre";
		 
//		 //usages
//		 System.out.println("institute[0]");
//		 System.out.println("institute[1]");
//		 System.out.println("institute[2]");
//		 System.out.println("institute[3]");
		 
		for(int i=0;i<=3;i++)
		{
			System.out.println(institute[i]);
		}

	}

}
