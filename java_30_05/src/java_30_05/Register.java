package java_30_05;

public interface Register {
	
	void showReceipt(); // abstract
	default void getId() {
		System.out.println("Id: " + 13);
	}
}
