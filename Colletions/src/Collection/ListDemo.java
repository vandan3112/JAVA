package Collection;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		System.out.println("Size:"+list1.size());
		System.out.println("Is list empty? " + list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add('A');
		list1.add(5,"Hii");
		list1.add(10);
		
		System.out.println("List is: "+list1);
		
		System.out.println("Is list contains 15 ? " + list1.contains(15) );
		list1.remove(false);
		
		System.out.println("List is: "+list1);
		
		System.out.println("Element at 5th location is: "+list1.get(5));
		System.out.println("Element removed: "+list1.remove(list1.lastIndexOf(10))); //last occurence of list
		System.out.println("Element removed: "+list1.remove(list1.indexOf(10))); //particular occurence
		
		System.out.println("List is: "+list1);
		/*
		Collections.sort(list1);
		System.out.println("List is: "+list1);
		*/
		list1.clear();
		System.out.println("List is: "+list1);
		
		//generics //generation //Homogeneous List
		List<String> names = new ArrayList<>();
		names.add("Yash");
		names.add("Vandan");
		names.add("Ronak");
		names.add("Kishan");
		names.add("Rohan");
		
		System.out.println("List is: " +names);
		
		Collections.reverse(names);
		System.out.println("List is: " +names);
		
		//Traverse a list
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			
			if(nm.equals("Yash")) {
				i.remove();
			}
		}
		
		System.out.println("Name List is: " +names);
		
		//Traverse in reverse / Backward order
		ListIterator<String> li = names.listIterator(names.size());
		while(li.hasPrevious()) {
			String nm = li.previous();
			System.out.println(nm);
		}
	}

}
