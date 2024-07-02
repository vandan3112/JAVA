package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	/* Linked List
			add();
			addFirst();
			addLast();
			getFirst();
			getLast();
			removeFirst();
			removeLast();
			sort();
			reverse(); */
	
	public static void main(String[] args) {
		
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Sloth");
		System.out.println("Initial Vector: "+animals);
		
		//using get method
		String element = animals.get(2);
		System.out.println("Element at index 2: "+element);
		
		//using iterator()
		Iterator<String> i = animals.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
			System.out.print(", ");
		}
		element = animals.remove(1);
		System.out.println("Removed Element: "+element);
		System.out.println("New Vector: "+animals);
	}
}
