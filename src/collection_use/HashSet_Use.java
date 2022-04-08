package collection_use;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Use {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("sid");
		hs.add(100);
		hs.add('B');
		hs.add(100); // added duplicate >>does not allow duplication
		hs.add(null);
		hs.add(null); // allow only one null value

		System.out.println(hs); // shows random insertion order
		System.out.println(hs.size());
		System.out.println(hs.contains("s")); // gives boolean false because we don't have "s"
		hs.remove('B');
		System.out.println(hs);

//		for(int i=0;i<=hs.size()-1;i++) {        // for loop we can not use in hashset
//			System.out.println(hs.getClass());
//		}
		System.out.println("==============using iterator================");
		// hs.removeAll(hs);

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
System.out.println("===========using for each======================");
		for(Object O:hs) {
			System.out.println(O);
		}
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
//		hs.removeAll(hs);
//		System.out.println(hs.isEmpty());
	}

}
