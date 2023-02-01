package ListCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		EmployeePractice ep1 = new EmployeePractice("Tom", 20, "QA", "Delhi");
		EmployeePractice ep2 = new EmployeePractice("thomas", 30, "dev", "Mumbai");
		
		ArrayList<EmployeePractice> aep = new ArrayList<EmployeePractice>();
		
		aep.add(ep1);
		aep.add(ep2);
		
		 Iterator<EmployeePractice> it = aep.iterator();
		 while(it.hasNext()) {
			 
			 EmployeePractice aep1 = it.next();
			 System.out.println(aep1.name);
			 System.out.println(aep1.age);
			 System.out.println(aep1.dept);
			 System.out.println(aep1.Address);
			 
		 }
	}

}
