package collection_use;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> in = new ArrayList<>();
		in.add(844695);
		in.add(8);
		in.add(4);
		in.add(6);
		in.add(9);
		in.add(5);
		System.out.println(in);

		System.out.println("===========using foreach=============");
		// using for each loop
		for (int i : in) {
			System.out.println(i);
		}

		System.out.println("===========using iterator============");
		// using iterator
		Iterator<Integer> in1 = in.iterator();
		while (in1.hasNext()) {
			System.out.println(in1.next());
		}
		
		System.out.println("using for loop");
		//using for loop
		for(int i=0;i<=in.size()-1;i++) {
			System.out.println(in.get(i));
		}
	}

}
