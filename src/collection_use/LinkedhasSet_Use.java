package collection_use;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhasSet_Use {

	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();
		lh.add(1234);
		lh.add("my school");
		lh.add(null); //only 1 null accept 
		lh.add(null);
		lh.add(1234); //duplication not allowed
		lh.add(38.88f);
		System.out.println(lh); //order of insertion is maintained
		System.out.println(lh.isEmpty());
		
		System.out.println("=================using for each================");
		for(Object o:lh) {
			System.out.println(o);
		}
		
		System.out.println("===========using iterator==================");
		Iterator ite = lh.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}

}
