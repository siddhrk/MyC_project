package variable_types;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer_Info c =new Customer_Info();
		c.cust_name="sid k";
		c.cust_accno=1234;
		c.cust_bal=1111111.1f;
		
		Customer_Info d =new Customer_Info();
		d.cust_name="kunal j";
		d.cust_accno=3456;
		d.cust_bal=11111.11f;
		
		c.deposite();
		d.deposite();
	}

}
