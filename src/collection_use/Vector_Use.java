package collection_use;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Use {

	public static void main(String[] args) {
		 
		Vector v=new Vector<>();
		v.add("Union Government");
		v.add(29);
		v.add("State Government");
		v.add(11.42f);
		v.add('A');
		v.add(null);
		//System.out.println(v.isEmpty());
System.out.println(v);
System.out.println(v.size()); //length 		
	System.out.println(v.contains(29));	
	System.out.println(v.get(0));
	System.out.println(v.indexOf('A'));
		v.add(0,"sid"); //right shift sid added at 0 index
		System.out.println(v);
		 v.remove(1); //left shift after union government remove(1)
		 System.out.println(v);
		 System.out.println("============for each loop===============");
		 for(Object o:v) {
			 System.out.println(o);
		 }
		 System.out.println("==========using iterator=================");
		 
		 Iterator it = v.iterator(); //universal iterator
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		System.out.println("=============using listiterator=============");
		
		 ListIterator list = v.listIterator();
		 while(list.hasNext()) {
			 System.out.println(list.next());
		 }
		 System.out.println("==========using enumeration==================");
		 
		 Enumeration en = v.elements();
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }
		 
		 
	}

}
