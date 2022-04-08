package collection_use;

import java.util.ArrayList;
import java.util.Iterator;
 

public class Arraylist_Use {

	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add("sidkokate");
		al.add(84469);
		al.add('A');
		al.add("Pune");
		al.add(null);
	 
	 
		System.out.println(al);
		System.out.println(al.size());
		
		
		al.add("Good Morning");
		System.out.println(al.contains('A'));
		 System.out.println(al.contains("Pune"));
		 System.out.println(al.isEmpty());
		 System.out.println(al.get(1));
		
		 System.out.println("===========using For loop===============");
		 for(int i = 0;i<=al.size()-1;i++) {
			 System.out.println(al.get(i));
		 }
		 System.out.println("=============using Iterator===============");
		 
		 Iterator it = al.iterator(); //using iterator
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	System.out.println("==============using for each================="); 
		 for(Object o:al) {
			 System.out.println(o);
		 }
		 
	}

}
