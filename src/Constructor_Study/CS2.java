package Constructor_Study;

public class CS2 {

	public CS2() // this is user defined zero parameter constructor
	{
		System.out.println("running zero parameter constructor");
	
	}

	public CS2(int a)
	{
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CS2 cs=new CS2();
    cs.test1();
 
	}
    public  void test1() {
    
    	System.out.println("this is non static method");
}
}
