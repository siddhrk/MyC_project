package variable_types;

public class Global_Variable {
  int a=60; //non static global variable
  static int b=50; // static global variable


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Global_Variable gv=new Global_Variable();
   gv.addition();
   gv.test();
		
	}
public void addition()
{
	int c=40; // local variable
	int sum=a+c;
	System.out.println("addition is "+sum);
}
public void test()
{
	float d=50.55f;
	float sum=d+b;
	System.out.println("addition is "+sum);
}

	

}
