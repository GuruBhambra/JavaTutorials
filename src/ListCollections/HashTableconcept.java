package ListCollections;

import java.util.Enumeration;
import java.util.Hashtable;

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
			 System.out.println(aa);
		 }
		 
			Hashtable<Integer, String> h2 = new Hashtable<>();
			
			h2.put(1, "selenium");
			h2.put(2, "JAVA");
			h2.put(3, "API");
			h2.put(4, "RestfulAPI");
			
			if(h2.equals(h1)) {
				
				System.out.println("both are equal");
			}
			else {
				System.out.println("Not equal");
			}
			
			Hashtable h3 = new Hashtable();
	
			 h3= (Hashtable) h1.clone();
			 System.out.println(h3);
	}

}
