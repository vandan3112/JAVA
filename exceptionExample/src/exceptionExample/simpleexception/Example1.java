package exceptionExample.simpleexception;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=12;
		b=0;
		
		try {
			int[] arr = {1,2,3,4,5};
			c=a/b;
			
			System.out.println(arr[10]);
			System.out.println("Will not be printed.");
		}
		catch(ArrayIndexOutOfBoundsException ari) {
			System.out.println(ari.getMessage());
		}
		catch(ArithmeticException ar) {
			System.out.println("Can not  divide any number " + ar.getMessage());
		}
		catch(Exception eo) {
			System.out.println(eo.getMessage());
		}
		finally {
			System.out.println("Bye..Bye..");
		}
	}

}
