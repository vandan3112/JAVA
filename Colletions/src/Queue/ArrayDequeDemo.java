package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> ad = new ArrayDeque<>();
		ad.add("A");
		ad.add("B");
		ad.add("C");
		
		System.out.println(ad);
		
		ad.offer("F");
		ad.offerFirst("D");
		ad.offerLast("E");
		
		System.out.println(ad);
		
	}

}
