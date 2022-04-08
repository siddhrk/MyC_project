package casting_study;

public class Primitive {

	public static void main(String[] args) {
		 int a=5; //lower data type information converted into higher called as implicit casting
		 System.out.println(a);
		 double b=a; //widening
		 System.out.println(b);

		 double d=10.55; //explicit casting>>higher data to lower
		 System.out.println(d);
		 int i= (int) d; //also called as narrowing casting
		 System.out.println(i);
		 
	}

}
