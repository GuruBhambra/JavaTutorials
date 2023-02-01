package ListCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableconcept {

	public static void main(String[] args) {
	
		
		Hashtable <Integer, String>h1 = new Hashtable<>();
		
		h1.put(1, "selenium");
		h1.put(2, "JAVA");
		h1.put(3, "API");
		h1.put(4, "RestAPI");

		
		 Enumeration e = h1.elements();
		 while(e.hasMoreElements()) {
			Object aa = e.nextElement();
			 //System.out.println(aa);
		 }
		 
			Hashtable<Integer, String> h2 = new Hashtable<>();
			
			h2.put(1, "selenium");
			h2.put(2, "JAVA");
			h2.put(3, "API");
			h2.put(4, "RestfulAPI");
			
			if(h2.equals(h1)) {
				
				//System.out.println("both are equal");
			}
			else {
				//System.out.println("Not equal");
			}
			
			Hashtable h3 = new Hashtable();
	
			 h3= (Hashtable) h1.clone();
			// System.out.println(h3);
			 
			 
			 Hashtable<Integer,Employee> h = new Hashtable<>();
			 
			 Employee e1 = new Employee("Guru", 20, "qa");
			 Employee e2 = new Employee("GuruSingh", 230, "qaaseasf");
			 Employee e3 = new Employee("GuruBhamra", 210, "qefweafsfsa");
			 Employee e4 = new Employee("Guru", 2330, "qasfsrf");
			 
			 h.put(1, e1);
			 h.put(2, e2);
			 h.put(3, e3);
			 h.put(4, e4);
			 
			 Enumeration<Employee> em = h.elements();
			 while (em.hasMoreElements()) {
				Employee emp =  em.nextElement();
				
				System.out.println(emp.name + " " + emp.age); 
	}
//				Set<Entry<Integer, Employee>> s = h.entrySet();
//				for(Entry<Integer, Employee> s1:s) {
//					Employee obj =  s1.getValue();
//				System.out.println(obj.name + " " + obj.age + " " + obj.dept);
//				}

	}

}
