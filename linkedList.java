package collection;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Ravi");
		ls.add("Roy");
		ls.add("Bob");
		// System.out.println(ls);
		
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		
	}

 }
}
