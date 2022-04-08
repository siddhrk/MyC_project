package collection_use;

import java.util.PriorityQueue;

public class PriorityQ_Use {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.add("My");
		pq.add("Name");
		pq.add("is");
		pq.add("Shiddhodhan");
		pq.add("Kokate");
		// pq.add(28); //ClassCastException >>>> not allow different data
		System.out.println(pq); // order of insertion random
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println(pq.poll()); //Retrieves and removes the head of this queue
		System.out.println(pq);

		System.out.println(pq.peek()); //Retrieves, but does not remove, the head of this queue
		System.out.println(pq);

		pq.remove();
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.removeAll(pq)); //remove all data shows true boolean value
		pq.removeAll(pq);
		System.out.println(pq);  
		System.out.println(pq.poll());  //removes all date shows null in console
	
	}

}
