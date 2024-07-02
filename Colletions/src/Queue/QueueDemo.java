package Queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		//add elements of 5 in queue
		for(int i=0;i<5;i++) {
			q.add(i);
			
			System.out.println(q);
		}
		
		//remove the head of the element
		int removable = q.remove();
		System.out.println(removable);
		System.out.println(q);
		
		//retriving the head element
		int head = q.peek();
		System.out.println(head);
		
		int size = q.size();
		System.out.println(size);
	}

}
