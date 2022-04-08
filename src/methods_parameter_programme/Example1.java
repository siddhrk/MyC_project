package methods_parameter_programme;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    studentinfo();
    studentinfo();
    //to call non static method we have to create object.syntax>> classname objectname=new classname
    Example1 Obj= new Example1();
    
    Obj.addition(10, 20, 30);
    		
	}
public static void studentinfo() { //without parameter
	String name= "sid";
	int Rollnum= 10;
	char Grade= 'A';
	float Weight= 75.55f;
	    System.out.println("===============================");
		System.out.println("student name is "+ name);	
		System.out.println("student roll no is "+ Rollnum);
		System.out.println("student grade is "+Grade);
		System.out.println("student weight is "+ Weight);
		System.out.println("================================");
}	
		
		
		public static void studentinfo1(String name,int Rollnum,char Grade,float Weight)
		{
			// method with parameter
		
		System.out.println("====================================");	
		System.out.println("student name is " +name);	
		System.out.println("student Roll number is " +Rollnum);
		System.out.println("student grade is " + Grade);
		System.out.println("student weight is " +Weight);
		System.out.println("====================================");
		
			
		
}
	public void addition (int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum is " +sum);
			
}
}
	
