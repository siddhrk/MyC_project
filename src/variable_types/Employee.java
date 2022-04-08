package variable_types;

public class Employee {

	String Emp_name="sachin";
	int Emp_code=11;
	char Emp_grade='A';
	float Emp_sal=1100000.11f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e=new Employee();
       e.Emp_info();
       	
	}
public void Emp_info(){
	System.out.println("============================");
	System.out.println("employee name is "+Emp_name);
	System.out.println("employee code is "+Emp_code);
	System.out.println("employee grade is "+Emp_grade);
	System.out.println("employee salary is "+Emp_sal);
	System.out.println("==============================");
	
	
}

}
