package keywords_study;

public class This {
	// this keyword used to access global variable in same class
	int a=80;
	float b=88.88f;
	String name="sid";
	char grade='A';
	
	static int c=90;
	
	public static void main(String[] args) {
		 
		System.out.println("a");
		 System.out.println("this.b");// calling global variable in main method
	
		  This s=new This();
		  s.show();
		 
	}
   public void show() {
	int a=5;
	int d=20;
	int sum;
	float sum1;
	sum=a+this.a;  //sum of local variable and global variable
	sum1=this.b+d;
	System.out.println("addition is "+sum1);
	System.out.println("addition is "+sum);
	System.out.println("d"); //calling local variable
	sum =a+d;
	System.out.println("sum is "+sum); //addition of local variables
	
System.out.println("name is "+name);
	System.out.println("grade is "+grade);
	
	sum=a+this.c; //sum of static global with local variable
	System.out.println("sum is "+sum);
}
	
	
}
