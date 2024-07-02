package WildCard;

import java.util.ArrayList;

public class UpperBoundWildCardDemo {

	public static Double sumofList(ArrayList<? extends Number> al) {
		
		double sum = 0.0;
		for(Number n:al) {
			sum = sum+n.doubleValue();
		}
		return sum;
	}
}
