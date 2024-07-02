package WildCard;

import java.util.List;

public class LowerBoundWildCardDemo {
	
	//it restricts the unknown type should be particular type or super class of integer
	public static void displayNumbers(List<? super Integer> list) { //any super class of integer class
		
		for(Object n:list) {
			
		}
	}
}
