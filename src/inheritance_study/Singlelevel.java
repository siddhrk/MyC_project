package inheritance_study;

public class Singlelevel {

	public static void main(String[] args) {
		 
		UPSC u =new UPSC();  // object of super class
		u.ias();
		u.ips();

		// now object of child class
	Aspirant a=new Aspirant();
	a.prelims();
	a.mains();
	a.ias();
	a.ips();
	}

}
