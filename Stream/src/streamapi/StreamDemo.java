package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {

		//Create a stream from set of values
		Stream<Integer> stream = Stream.of(10,20,30,40,50,60,70);
		
		///Counting the values
		System.out.println(stream.count());
		//stream.forEach(System.out::println);//printing stream value--->another way
		
		
		
		//creating array
		Integer[] values = new Integer[] {10,20,30,13,10,11,12,13};
		//creating the stream from array
		stream = Arrays.stream(values);
		
		
		
		//map
		System.out.println("Square of" + Arrays.toString(values) + " is as follows: ");
		
		stream.map(num -> num * num).forEach(System.out::println);
		/*stream = stream.map(n->n*n);
		stream.forEach(System.out::println);*/
		
		//limit
		System.out.println("First 2 elements are: ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//skip
		System.out.println("Elements excepts first 4: ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		//distinct
		System.out.println("Distinct Elements are : ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		//List
		List<String> words = Arrays.asList("Hello","Stream","Learning");
		//words.add("Happy"); //immutable list
		
		//Create a stream from List
			/*
			 * toUpperCase
			 * toLowerCase
			 * collect--->Collectors--->applicable in list and set
			 */
		Stream<String> stream1 = words.stream();
		System.out.println(words);
		
	}

}
