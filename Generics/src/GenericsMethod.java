
public class GenericsMethod {

	public <E> void displayArrayElement(E[] elements) {
		for(E element : elements) {
			System.out.println(element);
		}
	}
}
