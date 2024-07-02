package Queue;
import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> p = new PriorityQueue<>();
		p.add("Core JAVA");
		p.add("C");
		p.add("Python");
		p.add("Advanced JAVA");
		
		System.out.println(p);
		
		p.remove();
		System.out.println(p);
		
		System.out.println("Poll method: "+p.poll());
		System.out.println(p);
		
		System.out.println("Peek Method: "+p.peek());
	}

}
