package ListCollections;


import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Gurpreet");
		hm.put(2,"Singh");
		hm.put(3, "Bhambra");
		
		//System.out.println(hm.get(1));
		
		for(Entry m :hm.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hm.remove(2);
		System.out.println(hm);
		System.out.println("********************");
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 20, "qa");
		Employee e2 = new Employee("Thomas", 30, "qae");
		Employee e3 = new Employee("Tommy", 25, "qaer");
		Employee e4 = new Employee("Steve", 22, "qaraew");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);

		for(Entry<Integer, Employee> employee : emp.entrySet()) {
			
			int key = employee.getKey();
			Employee getEmployee = employee.getValue();
			
			System.out.println(key + " " + getEmployee.name + " " + getEmployee.age+ " " + getEmployee.dept );
			
		}
		
	}

}
