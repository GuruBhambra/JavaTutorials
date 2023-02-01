package ListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);

		// System.out.println(ar.get(3));

		for (int i = 0; i < ar.size(); i++) {

			// System.out.println(ar.get(i));
		}

		Employee e1 = new Employee("Guru", 20, "QA");
		Employee e2 = new Employee("Preet", 30, "Dev");
		Employee e3 = new Employee("Gurpreet", 27, "Software Tester");

		ArrayList<Employee> employee = new ArrayList<Employee>();

		employee.add(e1);
		employee.add(e2);
		employee.add(e3);

		Iterator<Employee> it = employee.iterator();

		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("***************");

		ArrayList arr = new ArrayList();

		arr.add(1);
		arr.add(2);

		ArrayList arrr = new ArrayList();

		arrr.add(3);
		arrr.add(4);

		arr.addAll(arrr);

		for (int i = 0; i < arr.size(); i++) {

			System.out.println(arr.get(i));
		}
		
		System.out.println("***************");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		
		list2.add(2);
		list2.add(5);
		
		list.retainAll(list2);
		
		for(int i =0; i< list.size();i++) {
			
			System.out.println(list.get(i));
		}
	}

}
