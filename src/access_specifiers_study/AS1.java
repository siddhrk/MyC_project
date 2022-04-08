package access_specifiers_study;

public class AS1 {
    int a=10; //default global variable
    private int b=20; //private global variable
	protected int c=30; //protected global variable
	public int d=40; //public global variable
	
	
	public static void main(String[] args) {
		 AS1 as=new AS1();
		 as.sid1(); //calling private>>> can call only within the same class
		 as.sid2(); //protected >>> within package & access outside the package by inheritance
		 as.sid3(); //public >>> scope throughout project
		 as.sid4(); //default >>> within package
System.out.println("====================================================");

        System.out.println("default global variable a is "+as.a);
        System.out.println("private global variable b is "+as.b);
        System.out.println("protected global variable c is "+as.c);
        System.out.println("public global variable d is  "+as.d);
		 
	}
private void sid1() {
	System.out.println("this is private sid1 method from AS1 class");
}
protected void sid2() {
	System.out.println("this is protected sid2 method from AS1 class");
}
public void sid3() {
	System.out.println("this is public sid3 method from AS1 class");
}
void sid4() {
	System.out.println("this is default sid4 method from AS1 class");
}
}
