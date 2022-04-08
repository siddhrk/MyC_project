package interface_study;

public class Child implements Father,Mother {
  //two parent class inherited in child class >> multiple inheritance achieved
	public static void main(String[] args) {
		Child c=new Child();
		c.property(); //calling fathers property
		c.money();
		c.love();
		c.nature();
		
		c.look(); //calling default method of father & mother
	
		Father.love(); //static method call from father Interface
		Father.nature();
	}
@Override
public void love() {
	 System.out.println("mothers love");
	
}

@Override
public void nature() {
	 System.out.println("mothers nature");
	
}

@Override
public void money() {
	 System.out.println("fathers money inherited in child class");
	
}

@Override
public void property() {
	 System.out.println("fathers property inherited in child class");
}
public void look() {
	//to call specific default method from super interface follow syntax
			// interfacename.super.methodname
	Father.super.look();
	Mother.super.look();
}


}
