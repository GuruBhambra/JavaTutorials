package ListCollections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("guru");
		ll.add("singh");
		ll.add("bhambra");
		System.out.println(ll.get(0));
		
		ll.addFirst("Mr.");
		ll.addLast("Thank u");
		System.out.println(ll);
		
		

	}

}
