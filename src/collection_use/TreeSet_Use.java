package collection_use;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Use {

	public static void main(String[] args) {
		 TreeSet tr=new TreeSet();
		//ClassCastException: we can use only homogeneous data in treeset
		 
		 tr.add(1);
		 tr.add(2);
		 tr.add(3);
		 tr.add(4);
		// tr.add(null); //NullPointerException  >> not accept null
		 System.out.println(tr);
		 
		 System.out.println(tr.contains(4));
		 
		 System.out.println(tr.pollFirst());
		 System.out.println(tr);
		 System.out.println(tr.pollLast());
		 System.out.println(tr);

		 System.out.println("======using iterator========");
		 Iterator it = tr.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("=======using for each========"); 
		 for(Object o:tr) {
			 System.out.println(o);
		 }
		 
	}

}
