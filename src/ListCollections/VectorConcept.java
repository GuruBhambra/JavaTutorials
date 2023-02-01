package ListCollections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		
		
//		for(int i=0;i<vec.size();i++) {
//			
//			System.out.println(vec.get(i));
//		}
		
		 Iterator<Integer> it = vec.iterator();
		 while(it.hasNext()) {

			    int myVector = it.next();
			 System.out.println(myVector);
		 }
		 
		 Vector<Integer> myVec = new Vector<>();
		 myVec.add(110);
		 myVec.add(210);
		 myVec.add(310);
		 
		 vec.addAll(myVec);
		 
		 System.out.println(vec);
	}

}
