package ListCollections;

import java.util.LinkedList;
import java.util.Map.Entry;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<Employee> ll = new LinkedList<Employee>();
		
//		ll.add("guru");
//		ll.add("singh");
//		ll.add("bhambra");
//		System.out.println(ll.get(0));
//		
//		ll.addFirst("Mr.");
//		ll.addLast("Thank u");
//		System.out.println(ll);
		
		Employee e1 = new Employee("Tom", 20, "sgfsef");
		Employee e2 = new Employee("GURU", 220, "ADAEDGYAEDG");
		
		ll.add(e1);
		ll.add(e2);
		Employee ee =ll.element();
		
		System.out.println(ee.name);
		
		

	}

}
