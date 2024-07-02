
public class GenericsClassDemo<T> {

	T data;
	
	void set(T data) {
		this.data = data;
	}
	
	T get() {
		return data;
	}
}
